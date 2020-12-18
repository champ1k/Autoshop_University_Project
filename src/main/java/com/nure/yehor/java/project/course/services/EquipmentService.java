package com.nure.yehor.java.project.course.services;

import com.nure.yehor.java.project.course.entities.Equipment;
import com.nure.yehor.java.project.course.entities.Equipment;
import com.nure.yehor.java.project.course.operations.EquipmentOperations;
import com.nure.yehor.java.project.course.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService implements EquipmentOperations {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    public List<Equipment> findAll() {
        return equipmentRepository.findAll();
    }

    @Override
    public Equipment findEquipmentById(Integer id) {
        return equipmentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Equipment equipment) {
        equipmentRepository.save(equipment);
    }

    @Override
    public void delete(Integer id) {
        equipmentRepository.deleteById(id);
    }

}