package com.appcitor.test.swsecurity.service;

import com.appcitor.test.swsecurity.model.User;
import com.appcitor.test.swsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by linuxlite on 6/27/19.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepo;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User userByUserName = userRepo.findByUsername(s);
        if (userByUserName == null) {
            throw new UsernameNotFoundException("User 404!");
        }
        return new UserDetailPrinciple(userByUserName);
    }
}
