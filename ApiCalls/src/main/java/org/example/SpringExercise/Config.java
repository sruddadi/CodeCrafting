package org.example.SpringExercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Person person() {
        return new Person();
    }

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Account account() {
        return new Account();
    }
}
