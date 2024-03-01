package com.example.employeeService.services.Impl;

import com.example.employeeService.dao.EmployeeDetailRepository;
import com.example.employeeService.mappers.EmployeeDetailMapper;
import com.example.employeeService.models.dto.EmployeeDetailDto;
import com.example.employeeService.services.EmployeeDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

    private final EmployeeDetailRepository repository;
    @Override
    public EmployeeDetailDto save(EmployeeDetailDto employeeDetailDto) {
        return EmployeeDetailMapper.INSTANCE.toDto(repository.save(EmployeeDetailMapper.INSTANCE.toEntity(employeeDetailDto)));
    }

    @Override
    public List<EmployeeDetailDto> findAll() {
        return EmployeeDetailMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public EmployeeDetailDto findById(Long id) {
        return EmployeeDetailMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public EmployeeDetailDto update(EmployeeDetailDto employeeDetailDto) {
        return EmployeeDetailMapper.INSTANCE.toDto(repository.saveAndFlush(EmployeeDetailMapper.INSTANCE.toEntity(employeeDetailDto)));
    }
}
