package com.example.taskmanager.entity;

public enum TaskStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED
}

//Why enum?
// 1. Prevents invalid status values
// 2. Cleaner than strings
// 3. DB-safe when used correctly