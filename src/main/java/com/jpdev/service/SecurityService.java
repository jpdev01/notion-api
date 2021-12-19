package com.jpdev.service;

import com.jpdev.domain.User;
import com.jpdev.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    public Integer validateLogin(String login, String password)
    {
        return securityRepository.validate(login, password);
    }

    public User getUserByLogin(String login) {
        return securityRepository.findByLogin(login);
    }
}
