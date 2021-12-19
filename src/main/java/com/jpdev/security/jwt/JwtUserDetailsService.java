package com.jpdev.security.jwt;

import com.jpdev.domain.User;
import com.jpdev.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private SecurityService securityService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = findByLogin(login);
        if(user == null)
        {
            return null;
        }
        Integer userId = securityService.validateLogin(login, user.getPassword());

//        if (user.getEmail().equals(email)) {
//            return new User(email, user.getPassword(),
//                    new ArrayList<>());
//        } else {
//            throw new UsernameNotFoundException("User not found with email: " + email);
//        }

        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(),
                new ArrayList<>());
    }

//    public UserDetails loadUser(String login, String password) throws UsernameNotFoundException {
//        Integer userId = securityService.validateLogin(login, password);
//
////        if (user.getEmail().equals(email)) {
////            return new User(email, user.getPassword(),
////                    new ArrayList<>());
////        } else {
////            throw new UsernameNotFoundException("User not found with email: " + email);
////        }
//
//        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(),
//                new ArrayList<>());
//    }

    public User findByLogin(String login)
    {
        return securityService.getUserByLogin(login);
    }
}


