package com.udevotchi.appjava.service;

import com.udevotchi.appjava.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void userExists() throws Exception{
        //given
        Long id = 71L;

        //when
        User u = userService.findById(id);

        //then
        Assert.assertTrue(u != null);
        //Assert.assertTrue(u.getHistorique().size()== 1);

    }
}
