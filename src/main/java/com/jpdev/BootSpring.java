package com.jpdev;

import com.jpdev.domain.User;
import com.jpdev.repository.UserRepository;
import i18n.translations.I18nMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootSpring implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args)
    {
        SpringApplication.run(BootSpring.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Administrador");
//        user.setLogin("adm");
//        user.setPassword("adm");
//        user.setEmail("adm@gmail.com");
//        userRepository.save(user);
        System.out.println(I18nMessage.getString("whatisyouraddress"));;
    }
}

