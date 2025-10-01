package AstronutTaskScheduler.manager;

import AstronutTaskScheduler.model.Task;
import AstronutTaskScheduler.observer.ConflictObserver;
import AstronutTaskScheduler.exceptions.TaskConflictException;
import AstronutTaskScheduler.utils.LoggerFactory;

import java.time.LocalTime;
import java.util.*;
import java.util.logging.Logger;

public class ScheduleManager {
    private static final Logger logger = LoggerFactory.getLogger(ScheduleManager.class);
    private static ScheduleManager instance;
    private final List<Task> tasks = new ArrayList<>();
    private final List<ConflictObserver> observers = new ArrayList<>();

    private ScheduleManager() {}

    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(ConflictObserver observer) {
        observers.add(observer);
    }

    public void addTask(Task newTask) throws TaskConflictException {
        for (Task t : tasks) {
            if (overlaps(t, newTask)) {
                notifyObservers(newTask, t);
                throw new TaskConflictException("Task conflicts with existing task: " + t.getDescription());
            }
        }
        tasks.add(newTask);
        tasks.sort(Comparator.comparing(Task::getStart));
        logger.info("Task added: " + newTask);
    }

    public void removeTask(String description) {
        Optional<Task> task = tasks.stream()
                .filter(t -> t.getDescription().equalsIgnoreCase(description))
                .findFirst();

        if (task.isPresent()) {
            tasks.remove(task.get());
            logger.info("Task removed: " + description);
        } else {
            logger.warning("Task not found: " + description);
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            tasks.forEach(System.out::println);
        }
    }

    private boolean overlaps(Task t1, Task t2) {
        LocalTime s1 = t1.getStart(), e1 = t1.getEnd();
        LocalTime s2 = t2.getStart(), e2 = t2.getEnd();
        return s1.isBefore(e2) && s2.isBefore(e1);
    }

    private void notifyObservers(Task newTask, Task existingTask) {
        for (ConflictObserver o : observers) {
            o.onConflict(newTask, existingTask);
        }
    }
}
