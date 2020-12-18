package com.nure.yehor.java.project.course.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UserNotFoundException extends ResponseStatusException {
    public UserNotFoundException(Integer id) {
        super(HttpStatus.NOT_FOUND, "No such user with this id - " + id);
    }
}
