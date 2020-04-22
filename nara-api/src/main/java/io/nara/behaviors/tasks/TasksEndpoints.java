package io.nara.behaviors.tasks;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks")
public interface TasksEndpoints {

    @GetMapping
    ResponseEntity<List<Task>> get();

    @GetMapping("{id}")
    ResponseEntity<Task> getOne(@PathVariable("id") int taskId);

    @PostMapping
    ResponseEntity<Task> add(Task task);

    @DeleteMapping("{id}")
    ResponseEntity<HttpStatus> delete(@PathVariable("id") int taskId);

}
