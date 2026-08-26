package ru.job4j.my;

import java.util.Objects;

public class Task {
    private String description;
    private int priority;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return priority == task.priority && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, priority);
    }

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
