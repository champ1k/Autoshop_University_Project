package com.nure.yehor.java.project.course.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class OrderNotFoundException extends ResponseStatusException {
    public OrderNotFoundException(Integer id) {
        super(HttpStatus.NOT_FOUND, "No such auto with this id - " + id);
    }
}
