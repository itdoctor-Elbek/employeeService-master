package com.example.employeeService.services;

import org.springframework.stereotype.Service;

@Service

public interface ExcelService {
    byte[] generateEmployeesListExcel();
}
