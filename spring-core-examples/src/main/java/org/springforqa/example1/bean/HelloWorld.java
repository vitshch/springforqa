package org.springforqa.example1.bean;

public class HelloWorld implements Hello {

    private final String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(message);
    }
}
