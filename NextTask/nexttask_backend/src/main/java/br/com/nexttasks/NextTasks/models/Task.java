package br.com.nexttasks.NextTasks.models;

import java.time.LocalDate;
import java.util.Comparator;

public class Task implements Comparator<Task> {

    @Override
    public int compare(Task t1, Task t2) {
        return t1.getDeadline().compareTo(t2.getDeadline());
    }

    private String name;

    private LocalDate deadline;

    private Integer daysToComplete;

    private LocalDate dateStart;

    private LocalDate dateFinish;

    private Long lateness;


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

    public Integer getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(Integer daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Long getLateness() {
        return lateness;
    }

    public void setLateness(Long lateness) {
        this.lateness = lateness;
    }
}
