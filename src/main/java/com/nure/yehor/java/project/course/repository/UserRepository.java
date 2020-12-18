package com.nure.yehor.java.project.course.repository;

import com.nure.yehor.java.project.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByOrderId(Long orderId);
    User findUserByAutoId(Long chatId);
}
