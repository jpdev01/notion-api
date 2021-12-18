package com.jpdev.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<T> {

    public List<T> getAll();

    public Page<T> getAll(Pageable pageable);

    public T get(Integer id);
}
