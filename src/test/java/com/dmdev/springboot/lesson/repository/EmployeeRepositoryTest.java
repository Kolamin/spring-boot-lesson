package com.dmdev.springboot.lesson.repository;

import com.dmdev.springboot.lesson.IntegrationTestBase;
import com.dmdev.springboot.lesson.entity.EmployeeEntity;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest extends IntegrationTestBase {

    private static final Integer IVAN_ID = 1;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testFindById(){
        Optional<EmployeeEntity> employee = employeeRepository.findById( IVAN_ID );
        assertTrue( employee.isPresent() );
    }

    @Test
    void testFindByFirstName(){
        Optional<EmployeeEntity> employee = employeeRepository.findByFirstNameContaining( "va" );
        assertTrue(  employee.isPresent());
    }

    @Test
    void testFindByFirstNameAndSalary(){
        List<EmployeeEntity> employees =
                employeeRepository.findAllByFirstNameAndSalary( "Ivan", 1000 );
        MatcherAssert.assertThat( employees, hasSize(1) );
    }

}