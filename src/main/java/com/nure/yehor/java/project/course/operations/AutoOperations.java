package com.nure.yehor.java.project.course.operations;

import com.nure.yehor.java.project.course.entities.Auto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AutoOperations {
    Auto findAutoById(Integer id);

    List<Auto> findAll();

    void save(Auto auto);

    void delete(Integer id);

}