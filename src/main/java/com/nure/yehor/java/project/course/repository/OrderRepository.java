package com.nure.yehor.java.project.course.repository;

import com.nure.yehor.java.project.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
