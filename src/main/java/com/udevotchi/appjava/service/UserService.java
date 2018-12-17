package com.udevotchi.appjava.service;

import com.udevotchi.appjava.model.User;
import com.udevotchi.appjava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User findById(Long id) throws Exception {
        if(userRepository.exists(id)){
            return userRepository.findById(id);
        } else {
            throw new Exception("L'id n'existe pas");
        }
    }
}
