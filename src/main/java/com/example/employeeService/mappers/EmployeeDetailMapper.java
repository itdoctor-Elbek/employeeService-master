package com.example.employeeService.mappers;

import com.example.employeeService.models.dto.EmployeeDetailDto;
import com.example.employeeService.models.entity.EmployeeDetail;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeDetailMapper extends BaseMapper<EmployeeDetail, EmployeeDetailDto> {
    EmployeeDetailMapper INSTANCE= Mappers.getMapper(EmployeeDetailMapper.class);
}
