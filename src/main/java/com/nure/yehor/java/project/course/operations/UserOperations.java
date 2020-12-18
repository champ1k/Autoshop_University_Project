package com.nure.yehor.java.project.course.operations;

import com.nure.yehor.java.project.course.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserOperations {
    User findUserById(Integer id);

    List<User> findAll();

    void save(User user);

    void delete(Integer id);
    
    User create();

    void update(Integer id);
}
