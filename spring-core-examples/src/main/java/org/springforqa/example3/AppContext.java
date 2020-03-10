package org.springforqa.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean(name = "bean1")
    public Bean1 bean1() {
        return new Bean1("Hello World");
    }
}
