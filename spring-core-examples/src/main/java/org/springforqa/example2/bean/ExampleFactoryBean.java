package org.springforqa.example2.bean;

public class ExampleFactoryBean {

    public ExampleBean createExampleBean() {
        return new ExampleBean("Hello from Factory Bean");
    }

}
