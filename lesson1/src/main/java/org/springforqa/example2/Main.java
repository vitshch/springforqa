package org.springforqa.example2;

import org.springforqa.example2.bean.ExampleBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextExample2.xml");
        ExampleBean exampleBean = context.getBean("hello", ExampleBean.class);

    }
}
