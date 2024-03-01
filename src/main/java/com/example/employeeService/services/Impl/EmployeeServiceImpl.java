package com.example.employeeService.services.Impl;

import com.example.employeeService.dao.EmployeeRepository;
import com.example.employeeService.mappers.EmployeeMapper;
import com.example.employeeService.models.dto.EmployeeDto;
import com.example.employeeService.models.enums.Status;
import com.example.employeeService.models.request.EmployeeCreateRequest;
import com.example.employeeService.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        return EmployeeMapper.INSTANCE.toDto(repository.save(EmployeeMapper.INSTANCE.toEntity(employeeDto)));
    }

    @Override
    public List<EmployeeDto> findAll() {
        return EmployeeMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public EmployeeDto findById(Long id) {
        return EmployeeMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        return EmployeeMapper.INSTANCE.toDto(repository.saveAndFlush(EmployeeMapper.INSTANCE.toEntity(employeeDto)));
    }

    @Override
    public EmployeeDto create(EmployeeCreateRequest request){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setCreatedDate(LocalDateTime.now());
        employeeDto.setUpdatedDate(LocalDateTime.now());
        employeeDto.setStatus(request.getStatus());
        employeeDto.setGender(request.getGender());
        employeeDto.setName(request.getName());
        employeeDto.setEmail(request.getEmail());
        employeeDto.setLastname(request.getLastname());
        employeeDto.setMiddleName(request.getMiddleName());
        employeeDto.setPhone(request.getPhone());
        employeeDto.setTin(request.getTin());

        return save(employeeDto);
    }
}
