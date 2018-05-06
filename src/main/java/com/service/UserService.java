package com.service;

import com.entities.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Created  by wxl on 2018/1/23 0023.
 */
@Service
public class UserService {

    @Autowired
    private UserBean userBean;
    public void printUser(){
        userBean.setName("张三1");
        System.out.println(userBean);
    }
}
