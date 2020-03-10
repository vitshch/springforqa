package org.springforqa.example2;

import org.springforqa.example2.bean.ExampleBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example2 shows different approaches how to inject property into bean
 * <pre>
 * - with a constructor (exampleBean1)
 * - with a static factory method (exampleBean2)
 * - using an instance factory method (exampleBean3)
 * - with the FactoryBean (using Spring FactoryBean interface)
 * </pre>
**/
public class Example2 {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextExample2.xml");
        ExampleBean exampleBean1 = context.getBean("exampleBean1", ExampleBean.class);
        exampleBean1.print();

        ExampleBean exampleBean2 = context.getBean("exampleBean2", ExampleBean.class);
        exampleBean2.print();

        ExampleBean exampleBean3 = context.getBean("exampleBean3", ExampleBean.class);
        exampleBean3.print();
    }
}
