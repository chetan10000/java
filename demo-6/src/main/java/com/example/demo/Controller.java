package com.example.demo;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
 
    // standard constructors
	
    @Autowired
    private  PersonRepository personRepository;
    
 
    public Controller(PersonRepository persoRepository) {
		super();
		this.personRepository = personRepository;
	}

    
	@GetMapping("/users")
    public List<User> getUsers() {
		return (List<User>) personRepository.findAll();
		
		
       
    }
 
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        personRepository.save(user);
    }
    
}