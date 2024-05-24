package com.project.emp.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.emp.management.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}