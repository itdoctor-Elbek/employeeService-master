package com.example.employeeService.models.entity;

import com.example.employeeService.models.enums.Status;
import com.fasterxml.jackson.databind.introspect.AnnotatedAndMetadata;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_employeeDetail")
@AllArgsConstructor
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "createdDate")
    LocalDateTime createdDate;
    @Column(name = "updatedDate")
    LocalDateTime updatedDate;
    @Enumerated(EnumType.STRING)
    Status status;
    @ManyToOne
    Position position;
    @Column(name = "salary")
    int salary;
    @ManyToOne
    Employee employe;
    @Column(name = "experience")
    int experimence;
    @Column(name = "joinDate")
    LocalDate joinDate;
}
