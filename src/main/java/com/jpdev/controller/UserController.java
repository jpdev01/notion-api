package com.jpdev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController implements BaseController {

    @Override
    public void get(Integer id) {

    }

    @Override
    public void save(Object object) {

    }

    @Override
    public void put(Integer id, Object object) {

    }

    @Override
    public void delete(Integer id) {

    }
}
