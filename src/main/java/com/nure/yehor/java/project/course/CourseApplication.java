package com.nure.yehor.java.project.course;

import com.nure.yehor.java.project.course.entities.Equipment;
import com.nure.yehor.java.project.course.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.nure.yehor.java.project.course.*","com.nure.yehor.java.project.course.entities"})
@EnableJpaRepositories(basePackageClasses = {
        UserRepository.class,
        AutoRepository.class,
        EquipmentRepository.class,
        SupplierRepository.class,
        OrderRepository.class
})
@EntityScan(basePackages = {"org.alvl.nix.java.telegamusicbot.*"})
@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

}
