package AstronutTaskScheduler.observer;

import AstronutTaskScheduler.model.Task;

public interface ConflictObserver {
    void onConflict(Task newTask, Task existingTask);
}
