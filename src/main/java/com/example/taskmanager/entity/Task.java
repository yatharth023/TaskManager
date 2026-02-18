package com.example.taskmanager.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Task {


    @Id
    // @Id -> Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // instructs the database to automatically generate a unique primary key value for a new entity row, typically using an auto-increment column
    private Long id;

    private String title;

    private String description;


    @Enumerated(EnumType.STRING)
    // Enum -> It is a special user-defined data type that represents a fixed set of named constant
    // @Enumerated -> Declares that the field is enumerated type that needs to be mapped to a database column
    // EnumType.String -> convert the enum value to a String (VARCHAR) for the database
    private TaskStatus status;

    private LocalDate duedate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }
}
