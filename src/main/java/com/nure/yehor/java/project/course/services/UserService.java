package com.nure.yehor.java.project.course.services;

import com.nure.yehor.java.project.course.entities.User;
import com.nure.yehor.java.project.course.operations.UserOperations;
import com.nure.yehor.java.project.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserOperations {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User create() {
        //create user
        return null;
    }

    @Override
    public void update(Integer id) {
        //update user
    }


}
