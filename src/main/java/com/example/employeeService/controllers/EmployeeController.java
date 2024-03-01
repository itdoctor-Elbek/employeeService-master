package com.example.employeeService.controllers;

import com.example.employeeService.dao.EmployeeRepository;
import com.example.employeeService.models.dto.EmployeeDto;
import com.example.employeeService.models.request.EmployeeCreateRequest;
import com.example.employeeService.services.EmployeeService;
import com.example.employeeService.services.ExcelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/va/employee")
public class EmployeeController {
    @Qualifier("employeeService")
    private final EmployeeService service;
    private final ExcelService excelService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody EmployeeCreateRequest request){
        EmployeeDto dto = service.create(request);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/xlsx")
    public ResponseEntity<?> employeeInXlsx(){
        byte[] excelDocument = excelService.generateEmployeesListExcel();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "employeeList.xlsx");

        return ResponseEntity.ok().header(String.valueOf(headers)).body(excelDocument);
    }
}
