package com.example.taskmanager.repository;

import com.example.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // What just happened?
    // You got: Insert, Update, Delete, Fetch all / by id
    // Without writing SQL.
}