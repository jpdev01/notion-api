package com.jpdev.service;

import com.jpdev.domain.User;
import com.jpdev.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class UserService implements BaseService<User> {

    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> getAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User get(Integer id) {
        return userRepository.getById(id);
    }

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }


}
