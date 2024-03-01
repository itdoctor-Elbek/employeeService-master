package com.example.employeeService.mappers;

import java.util.List;

public interface BaseMapper <E, D>{
    E toEntity(D d);

    D toDto(E e);

    List<E> toEntity(List<D> dtos);
    List<D> toDtos(List<E> entities);

}
