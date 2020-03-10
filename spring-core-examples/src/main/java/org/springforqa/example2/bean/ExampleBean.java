package org.springforqa.example2.bean;

public class ExampleBean {

    private String message;

    public ExampleBean() {
    }

    public ExampleBean(String message) {
        this.message = message;
    }

    private static ExampleBean create() {
        return new ExampleBean("Hello from Factory Method");
    }

    public void print() {
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
