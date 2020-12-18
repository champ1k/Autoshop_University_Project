package com.nure.yehor.java.project.course.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auto")
    private Integer autoId;
    @Column(name = "price")
    private Integer price;
    @Column(name = "amount")
    private Integer duration;
    @Column(name = "description")
    private String description;
    @Column(name = "auto_name")
    private String autoName;
    @Column(name = "id_equipment")
    private String mimeType;
    @Column(name = "id_supplier")
    private Integer fileSize;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Order> orders = new ArrayList<>();
}
