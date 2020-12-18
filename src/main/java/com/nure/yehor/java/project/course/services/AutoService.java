package com.nure.yehor.java.project.course.services;

import com.nure.yehor.java.project.course.entities.Auto;
import com.nure.yehor.java.project.course.operations.AutoOperations;
import com.nure.yehor.java.project.course.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService implements AutoOperations {

    @Autowired
    private AutoRepository autoRepository;

    @Override
    public List<Auto> findAll() {
        return autoRepository.findAll();
    }

    @Override
    public Auto findAutoById(Integer id) {
        return autoRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Auto auto) {
        autoRepository.save(auto);
    }

    @Override
    public void delete(Integer id) {
        autoRepository.deleteById(id);
    }

}
