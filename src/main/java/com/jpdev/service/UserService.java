package com.jpdev.service;

import com.jpdev.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class UserService implements BaseService<User> {

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public Page<User> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public User get(Integer id) {
        return null;
    }

    @Override
    public void save(User entity) {

    }
}
