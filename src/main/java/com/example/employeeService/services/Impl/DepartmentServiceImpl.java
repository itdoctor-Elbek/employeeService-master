package com.example.employeeService.services.Impl;

import com.example.employeeService.dao.DepartmentRepository;
import com.example.employeeService.mappers.DepartmentMapper;
import com.example.employeeService.models.dto.DepartmentDto;
import com.example.employeeService.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository repository;

    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        return DepartmentMapper.INSTANCE.toDto(repository.save(DepartmentMapper.INSTANCE.toEntity(departmentDto)));
    }

    @Override
    public List<DepartmentDto> findAll() {
        return DepartmentMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public DepartmentDto findById(Long id) {
        return DepartmentMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public DepartmentDto update(DepartmentDto departmentDto) {
        return DepartmentMapper.INSTANCE.toDto(repository.saveAndFlush(DepartmentMapper.INSTANCE.toEntity(departmentDto)));
    }
}
