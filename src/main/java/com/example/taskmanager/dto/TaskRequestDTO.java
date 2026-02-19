package com.example.taskmanager.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class TaskRequestDTO {

    @NotBlank(message = "Title cannot be empty") // empty string protection
    private String title;

    private String description;

    @NotNull(message = "Status is required") // required field
    private String status;

    @FutureOrPresent(message = "Due date cannot be in the past") // real business rule
    private LocalDate dueDate;

    public @NotBlank(message = "Title cannot be empty") String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank(message = "Title cannot be empty") String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @NotNull(message = "Status is required") String getStatus() {
        return status;
    }

    public void setStatus(@NotNull(message = "Status is required") String status) {
        this.status = status;
    }

    public @FutureOrPresent(message = "Due date cannot be in the past") LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(@FutureOrPresent(message = "Due date cannot be in the past") LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
