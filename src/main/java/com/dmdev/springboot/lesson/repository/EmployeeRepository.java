package com.dmdev.springboot.lesson.repository;

import com.dmdev.springboot.lesson.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
