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
@Entity(name = "equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipment")
    private Integer equipmentId;
    @Column(name = "engine")
    private String engine;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "equipment", joinColumns = @JoinColumn(name = "id_equipment"), inverseJoinColumns = @JoinColumn(name = "id_color"))
    private List<Color> colors = new ArrayList<>();
    @Column(name = "body_type")
    private String bodyType;
    @Column(name = "doors_amount")
    private Integer doorsAmount;
    @Column(name = "transmission_type")
    private String transmissionType;
    @Column(name = "about_auto")
    private String aboutAuto;
}
