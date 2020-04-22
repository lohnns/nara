package io.nara.behaviors.tasks;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Task {

    private Integer id;
    private String label;
    private LocalDate dueDate;

}
