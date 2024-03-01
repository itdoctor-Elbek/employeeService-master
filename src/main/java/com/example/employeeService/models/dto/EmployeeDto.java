package com.example.employeeService.models.dto;

import com.example.employeeService.models.enums.Gender;
import com.example.employeeService.models.enums.Status;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    Long id;
    String name;
    String lastname;
    String middleName;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Status status;
    String tin;
    Gender gender;
    String phone;
    String email;

}
