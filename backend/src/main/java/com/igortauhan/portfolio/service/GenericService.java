package com.igortauhan.portfolio.service;

import java.util.List;

public interface GenericService<T, S> {

    List<T> findAll();
    T findById(Long id);
    T toDto(S entity);
}
