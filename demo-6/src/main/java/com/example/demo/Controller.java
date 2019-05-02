package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/login")
    public boolean login(@RequestBody User user) {
        return user.getName().equals("name") && user.getEmail().equals("email");
    }
    
	@GetMapping("/users")
    public List<User> getUsers() {
		return (List<User>) personRepository.findAll();
		
		}
	
	@GetMapping(value="/users/{name}")
	 public  User getUserByName(@PathVariable("name") String name){
		
		  User user = personRepository.findByName(name);

		    if(user == null){
		     System.out.println("noone");
		    }

		    //show the student as json object
		    return user;
	 }
	 @PutMapping("/users/{name}")
	    public User updateUser(@RequestBody User user) {
	        personRepository.save(user);
	        return user;
	    }
	 
	 @DeleteMapping("/users/{name}")
	     void DeleteUser(@RequestBody User user, @PathVariable ("name") String name) {
	         user = personRepository.findByName(name);
	        personRepository.delete(user);
	    }
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        personRepository.save(user);
    }
 
}