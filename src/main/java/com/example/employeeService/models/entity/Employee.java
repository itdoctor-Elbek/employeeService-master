package com.example.employeeService.models.entity;

import com.example.employeeService.models.enums.Gender;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_emplyee")
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "createdDate")
    LocalDateTime createdDate;
    @Column(name = "updateDate")
    LocalDateTime updatedDate;

    @Column(name = "name")
    String name;
    @Column(name = "lastname")
    String lastname;
    @Column(name = "middle_name")
    String middleName;
    @Column(name = "birth_date")
    String birthDate;
    @Column(name = "tin")
    String tin;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Column(name = "phone")
    String phone;
    @Column(name = "email")
    String email;
}
