package com;

import com.entities.UserBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Created  by wxl on 2018/1/23 0023.
 */
public class commonTest {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{ "spring-core.xml"});
        UserBean userBean = (UserBean) appContext.getBean("userBean");
        System.out.println(userBean); // UserBean{id=0, name='null', age=0, sex= }
    }


}
