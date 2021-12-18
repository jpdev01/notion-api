package com.jpdev.service;

import com.jpdev.domain.User;
import com.jpdev.dto.UserDTO;
import com.jpdev.repository.UserRepository;

import com.jpdev.validation.BusinessValidation;
import com.jpdev.validation.group.CustomGroupValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
public class UserService extends BaseService {

    @Autowired
    private UserRepository userRepository;

    UserService(Validator validator){
        super(validator);
    }

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

    public User save(UserDTO userDTO) {
        BusinessValidation businessValidation = validate(userDTO, CustomGroupValidator.ON_CREATE);
        //if (businessValidation.hasErrors()) return businessValidation;

        User user = new User();

        return user;
    }

}
