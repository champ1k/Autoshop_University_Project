package com.nure.yehor.java.project.course.operations;

import com.nure.yehor.java.project.course.entities.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierOperations {
    Supplier findSupplierById(Integer id);

    List<Supplier> findAll();

    void save(Supplier supplier);

    void delete(Integer id);
}
