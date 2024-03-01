package com.example.employeeService.services;

import com.example.employeeService.models.dto.DepartmentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService extends BaseService<DepartmentDto> {
    @Override
    DepartmentDto save(DepartmentDto departmentDto);

    @Override
    List<DepartmentDto> findAll();

    @Override
    DepartmentDto findById(Long id);

    @Override
    DepartmentDto update(DepartmentDto departmentDto);
}
