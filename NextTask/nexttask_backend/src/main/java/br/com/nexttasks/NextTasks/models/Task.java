package br.com.nexttasks.NextTasks.models;

import java.time.LocalDate;

public class Task {

    private String name;

    private LocalDate deadline;

    private Long daysToComplete;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Long getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(Long daysToComplete) {
        this.daysToComplete = daysToComplete;
    }
}
