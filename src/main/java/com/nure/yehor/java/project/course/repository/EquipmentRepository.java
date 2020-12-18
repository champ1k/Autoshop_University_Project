package com.nure.yehor.java.project.course.repository;

import com.nure.yehor.java.project.course.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

}
