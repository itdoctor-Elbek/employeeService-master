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
@Table(name = "tb_position")
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column
    LocalDateTime createdDate;
    @Column
    LocalDateTime  updateDate;
    @Enumerated(EnumType.STRING)
    Status status;
    @Column(name = "name")
    String name;
    @ManyToOne
    Department department;
}
