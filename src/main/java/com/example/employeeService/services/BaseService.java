package com.example.employeeService.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<D> {
    D save(D d);
    List<D> findAll();
    D findById(Long id);
    D update(D d);
}
