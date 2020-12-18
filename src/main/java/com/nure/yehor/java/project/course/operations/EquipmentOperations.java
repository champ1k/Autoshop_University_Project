package com.nure.yehor.java.project.course.operations;

import com.nure.yehor.java.project.course.entities.Equipment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EquipmentOperations {
    Equipment findEquipmentById(Integer id);

    List<Equipment> findAll();

    void save(Equipment equipment);

    void delete(Integer id);
}