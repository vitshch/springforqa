package org.springforqa.example1;

import org.springforqa.example1.bean.Hello;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* Basic example how to create Spring context from xml configuration
**/
public class Example1 {

    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextExample1.xml");
        Hello helloBean = context.getBean("hello", Hello.class);
        helloBean.print();
        context.registerShutdownHook();
    }
}
