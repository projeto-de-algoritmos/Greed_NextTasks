package br.com.nexttasks.NextTasks.controller;

import br.com.nexttasks.NextTasks.models.Task;
import br.com.nexttasks.NextTasks.service.TaskService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class TaskController {

    TaskService taskService;
    @PostMapping(path = "/processTasks", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> battlePokemon(@RequestBody List<Task> tasks) {
        try {
            return ResponseEntity.ok(taskService.minimizeLateness(tasks));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
