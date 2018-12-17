package com.udevotchi.appjava.model;

import com.udevotchi.appjava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run (String...strings) throws Exception {
        User u = userRepository.findById(71L);
        System.out.println(u);
    }
}
