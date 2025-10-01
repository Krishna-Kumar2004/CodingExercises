package AstronutTaskScheduler.observer;

import AstronutTaskScheduler.model.Task;

public class ConsoleConflictObserver implements ConflictObserver {
    @Override
    public void onConflict(Task newTask, Task existingTask) {
        System.out.printf("⚠️ Conflict: %s overlaps with %s%n",
                newTask.getDescription(), existingTask.getDescription());
    }
}
