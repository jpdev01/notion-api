package com.jpdev.notion.core;

import com.jpdev.notion.core.domain.User;
import com.jpdev.notion.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootSpring implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    public static void main(String[] args)
    {
        SpringApplication.run(BootSpring.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Administrador");
        repository.save(user);
    }
}

