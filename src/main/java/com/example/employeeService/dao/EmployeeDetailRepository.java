package com.example.employeeService.dao;

import com.example.employeeService.models.entity.EmployeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailRepository extends JpaRepository <EmployeeDetail,Long>{

}
