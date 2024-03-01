package com.example.employeeService.mappers;

import com.example.employeeService.models.dto.PositionDto;
import com.example.employeeService.models.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PositionMapper extends BaseMapper<Position, PositionDto>{
    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);
}
