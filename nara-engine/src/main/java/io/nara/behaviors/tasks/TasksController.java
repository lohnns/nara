package io.nara.behaviors.tasks;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TasksController implements TasksEndpoints {

    private final Tasks tasks;

    @Override
    public ResponseEntity<List<Task>> get() {
        return ResponseEntity.ok(tasks.getTasks());
    }

    @Override
    public ResponseEntity<Task> getOne(int taskId) {
        return null;
    }

    @Override
    public ResponseEntity<Task> add(Task task) {
        tasks.getTasks().add(task);
        return ResponseEntity.ok(task);
    }

    @Override
    public ResponseEntity<HttpStatus> delete(int taskId) {
        tasks.getTasks().removeIf(t -> taskId == t.getId());
        return ResponseEntity.ok().build();
    }
}
