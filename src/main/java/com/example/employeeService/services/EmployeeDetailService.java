package com.example.employeeService.services;

import com.example.employeeService.models.dto.EmployeeDetailDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeDetailService extends BaseService<EmployeeDetailDto> {
    @Override
    EmployeeDetailDto save(EmployeeDetailDto employeeDetailDto);

    @Override
    List<EmployeeDetailDto> findAll();

    @Override
    EmployeeDetailDto findById(Long id);

    @Override
    EmployeeDetailDto update(EmployeeDetailDto employeeDetailDto);

}
