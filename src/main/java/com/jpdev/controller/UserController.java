package com.jpdev.controller;

import com.jpdev.domain.User;
import com.jpdev.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User> {

    @Override
    public ResponseEntity<User> get(Integer id) {
        return null;
    }

    @Override
    public void put(Integer id, Object object) {

    }

    @Override
    public void delete(Integer id) {

    }

    public void save(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO.name);
    }
}
