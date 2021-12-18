package com.jpdev.service;

import com.jpdev.domain.User;
import com.jpdev.dto.UserDTO;
import com.jpdev.repository.UserRepository;

import com.jpdev.validation.BusinessValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class UserService implements BaseService<User> {

    @Autowired
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

    public User save(UserDTO userDTO) {
        BusinessValidation businessValidation = validate(userDTO);
        //if (businessValidation.hasErrors()) return businessValidation;

        User user = new User();

        return user;
    }

    private BusinessValidation validate(UserDTO userDTO){
//        Set<ConstraintViolation<Input>> violations = validator.validate(customer);
//        if (!violations.isEmpty()) {
//            throw new ConstraintViolationException(violations);
//        }
        BusinessValidation businessValidation = new BusinessValidation();
        if (userDTO.name == null) businessValidation.addError("Atributte name is necessary");

        return businessValidation;
    }


}
