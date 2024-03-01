package com.example.employeeService.services;

import com.example.employeeService.models.dto.PositionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PositionService extends BaseService<PositionDto>{
    @Override
    PositionDto save(PositionDto positionDto);

    @Override
    List<PositionDto> findAll();

    @Override
    PositionDto findById(Long id);

    @Override
    PositionDto update(PositionDto positionDto);

}
