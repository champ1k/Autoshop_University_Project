package com.nure.yehor.java.project.course.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AutoNotFoundException extends ResponseStatusException {
    public AutoNotFoundException(Integer id) {
        super(HttpStatus.NOT_FOUND, "No such auto with this id - " + id);
    }
}