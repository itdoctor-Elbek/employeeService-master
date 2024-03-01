package com.example.employeeService.mappers;

import com.example.employeeService.models.dto.EmployeeDto;
import com.example.employeeService.models.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee, EmployeeDto>{
    EmployeeMapper INSTANCE= Mappers.getMapper(EmployeeMapper.class);
}
