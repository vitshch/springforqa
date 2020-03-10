package org.springforqa.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Example3 shows How to create Annotation based config
 **/
public class Example3 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println(bean1.getMessage());
    }

}
