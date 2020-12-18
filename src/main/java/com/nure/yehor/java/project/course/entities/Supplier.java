package com.nure.yehor.java.project.course.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_supplier")
    private Integer supplierId;
    @Column(name = "supplier_name")
    private String supplierName;
    @Column(name = "country")
    private String country;
    @Column(name = "info")
    private String info;
    @Column(name = "supplier_rate")
    private Float supplierRate;
}

