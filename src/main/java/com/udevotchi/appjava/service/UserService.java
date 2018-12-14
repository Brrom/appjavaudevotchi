package com.udevotchi.appjava.service;

import com.udevotchi.appjava.model.User;
import com.udevotchi.appjava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceTest {
    @Autowired
    private UserRepository userRepository;
    public User findById(Long id) {
        if(validationId(id)){
            return userRepository.findById(id);
        } else {
            throw new Exception("L'id est incorrecte");
        }
    }
}
