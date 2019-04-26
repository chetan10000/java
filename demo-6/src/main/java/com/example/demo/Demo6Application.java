package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo6Application {
 
    public static void main(String[] args) {
        SpringApplication.run(Demo6Application.class, args);
    }
 
    @Bean
    CommandLineRunner init(PersonRepository personRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel","chetan").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@domain.com");
                personRepository.save(user);
            });
            System.out.println(personRepository.findAll());
        };
    }
}