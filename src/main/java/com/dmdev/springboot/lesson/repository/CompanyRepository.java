package com.dmdev.springboot.lesson.repository;

import com.dmdev.springboot.lesson.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
}
