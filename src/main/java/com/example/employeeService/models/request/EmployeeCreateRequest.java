package com.example.employeeService.models.request;


import com.example.employeeService.models.enums.Gender;
import com.example.employeeService.models.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class EmployeeCreateRequest {
    String name;
    String lastname;
    String middleName;
    String birthDay;
    String tin;
    Status status;
    Gender gender;
    String phone;
    String email;
}
