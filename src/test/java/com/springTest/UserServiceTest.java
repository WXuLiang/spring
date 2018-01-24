package com.springTest;

import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用springTest测试通过注解的方式注入userService
 * @author Created  by wxl on 2018/1/23 0023.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-core.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void printUser() throws Exception {
        userService.printUser();
    }

}