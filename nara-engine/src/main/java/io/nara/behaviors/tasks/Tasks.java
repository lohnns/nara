package io.nara.behaviors.tasks;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Tasks {

    @Getter
    private final List<Task> tasks = new ArrayList<>();
    {
        Task t1 = new Task();
        t1.setId(1);
        t1.setLabel("Task 1");
        Task t2 = new Task();
        t2.setId(2);
        t2.setLabel("Task 2");
        tasks.add(t1);
        tasks.add(t2);
    }

}
