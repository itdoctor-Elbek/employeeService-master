package com.example.employeeService.models.entity;

import com.example.employeeService.models.enums.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_department")
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "createdDate")
    LocalDateTime createdDate;
    @Column(name = "updatedDate")
    LocalDateTime updatedDate;
    @Enumerated(EnumType.STRING)
    Status status;


    @Column(name = "name")
    String name;

}
