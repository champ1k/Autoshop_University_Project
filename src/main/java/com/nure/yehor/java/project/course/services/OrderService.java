package com.nure.yehor.java.project.course.services;

import com.nure.yehor.java.project.course.entities.Order;
import com.nure.yehor.java.project.course.operations.OrderOperations;
import com.nure.yehor.java.project.course.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderOperations {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findOrderById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

}
