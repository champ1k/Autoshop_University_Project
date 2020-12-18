package com.nure.yehor.java.project.course.services;

import com.nure.yehor.java.project.course.entities.Supplier;
import com.nure.yehor.java.project.course.operations.SupplierOperations;
import com.nure.yehor.java.project.course.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements SupplierOperations {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findSupplierById(Integer id) {
        return supplierRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public void delete(Integer id) {
        supplierRepository.deleteById(id);
    }

}
