package com.example.employeeService.services;

import com.example.employeeService.models.dto.EmployeeDto;
import com.example.employeeService.models.request.EmployeeCreateRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface EmployeeService extends BaseService<EmployeeDto> {
    @Override
    EmployeeDto save(EmployeeDto employeeDto);

    @Override
    List<EmployeeDto> findAll();

    @Override
    EmployeeDto findById(Long id);

    @Override
    EmployeeDto update(EmployeeDto employeeDto);

    EmployeeDto create(EmployeeCreateRequest request);
}
