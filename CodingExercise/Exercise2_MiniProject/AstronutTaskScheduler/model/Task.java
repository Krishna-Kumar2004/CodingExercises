package AstronutTaskScheduler.model;

import java.time.LocalTime;

public class Task {
    private final String description;
    private final LocalTime start;
    private final LocalTime end;
    private final String priority;
    private boolean completed = false;

    public Task(String description, LocalTime start, LocalTime end, String priority) {
        this.description = description;
        this.start = start;
        this.end = end;
        this.priority = priority;
    }

    public String getDescription() { return description; }
    public LocalTime getStart() { return start; }
    public LocalTime getEnd() { return end; }
    public String getPriority() { return priority; }
    public boolean isCompleted() { return completed; }
    public void markCompleted() { this.completed = true; }

    @Override
    public String toString() {
        return String.format("%s - %s: %s [%s]%s",
                start, end, description, priority, completed ? " (Done)" : "");
    }
}
