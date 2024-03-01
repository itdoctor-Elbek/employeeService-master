package com.example.employeeService.mappers;

import com.example.employeeService.models.dto.DepartmentDto;
import com.example.employeeService.models.entity.Department;
import org.mapstruct.factory.Mappers;

public interface DepartmentMapper extends BaseMapper<Department , DepartmentDto>{
    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
}
