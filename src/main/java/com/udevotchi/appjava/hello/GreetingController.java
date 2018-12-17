package com.udevotchi.appjava.hello;


import com.udevotchi.appjava.model.User;
import com.udevotchi.appjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

    @Autowired
    UserService userService;
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/udevotchi")
    public User udevotchi(@RequestParam(value="id")Long id)throws Exception {
        return userService.findById(id);
    }
}

