package com.example.employeeService.services.Impl;

import com.example.employeeService.dao.PositionRepository;
import com.example.employeeService.mappers.PositionMapper;
import com.example.employeeService.models.dto.EmployeeDto;
import com.example.employeeService.models.dto.PositionDto;
import com.example.employeeService.services.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {
    private final PositionRepository repository;
    @Override
    public PositionDto save(PositionDto positionDto) {
        return PositionMapper.INSTANCE.toDto(repository.save(PositionMapper.INSTANCE.toEntity(positionDto)));
    }

    @Override
    public List<PositionDto> findAll() {
        return null;
    }

    @Override
    public PositionDto findById(Long id) {
        return null;
    }

    @Override
    public PositionDto update(PositionDto positionDto) {
        return null;
    }
}
