package com.jpdev.controller;

import com.jpdev.domain.User;
import com.jpdev.dto.UserDTO;
import com.jpdev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User> {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> get(Integer id) {
        return buildResponse(userService.get(id));
    }

    public void put(Integer id, Object object) {

    }

    public void delete(Integer id) {

    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity save(@RequestBody UserDTO userDTO) {
        return buildResponse(userService.save(userDTO));
    }
}
