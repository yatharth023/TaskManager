package com.example.taskmanager.exception;

public class ResourceNotFoundException extends RuntimeException {

    // This is the constructor. It allows you to pass a specific error message when the error occurs.
    public ResourceNotFoundException(String message) {
        super(message);
        // This sends your custom message up to the parent RuntimeException class
    }
}

// It is specifically designed to signal that a requested database entity or file is missing.
// extends RuntimeException -> This makes it an unchecked exception. Unlike "Checked" exceptions, you aren't forced by the compiler to use try-catch blocks every time you throw it, which keeps your business logic cleaner.
