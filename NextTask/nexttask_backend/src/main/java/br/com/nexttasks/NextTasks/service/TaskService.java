package br.com.nexttasks.NextTasks.service;

import br.com.nexttasks.NextTasks.models.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class TaskService{

    LocalDate currentDate;

    public List<Task> minimizeLateness(List<Task> tasks){
        currentDate = LocalDate.now();
        tasks.sort(new Task());

        tasks.forEach(task -> {
            task.setDateStart(currentDate);
            task.setDateFinish(currentDate.plusDays(task.getDaysToComplete()));
            task.setLateness(DAYS.between(task.getDeadline(), task.getDateFinish()));

            currentDate = task.getDateFinish();
        });

        return tasks;
    }
}
