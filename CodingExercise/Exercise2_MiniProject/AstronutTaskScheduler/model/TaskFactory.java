package AstronutTaskScheduler.model;

import java.time.LocalTime;

public class TaskFactory {
    public static Task createTask(String description, LocalTime start, LocalTime end, String priority) {
        if (description == null || description.isBlank())
            throw new IllegalArgumentException("Description cannot be empty.");
        if (end.isBefore(start) || start.equals(end))
            throw new IllegalArgumentException("End time must be after start time.");
        if (!priority.matches("(?i)low|medium|high"))
            throw new IllegalArgumentException("Priority must be Low, Medium, or High.");

        return new Task(description, start, end, priority);
    }
}
