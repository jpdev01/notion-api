package com.jpdev.controller;

public interface BaseController {

    public void get(Integer id);

    public void save(Object object);

    public void put(Integer id, Object object);

    public void delete(Integer id);
}
