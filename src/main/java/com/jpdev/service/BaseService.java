package com.jpdev.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {

    public List<T> getAll();

    public Page<T> getAll(Pageable pageable);

    public Optional<T> get(Integer id);

    public void save(T entity);
}
