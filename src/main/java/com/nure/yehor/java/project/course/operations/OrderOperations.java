package com.nure.yehor.java.project.course.operations;

import com.nure.yehor.java.project.course.entities.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderOperations {
    Order findOrderById(Integer id);

    List<Order> findAll();

    void save(Order order);

    void delete(Integer id);
}