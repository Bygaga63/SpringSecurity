package com.example.security2.controller;

import com.example.security2.model.User;
import com.example.security2.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class HomeController {

    UserRepository repository;

    @GetMapping(path = "user/{id}")
    public User getUser(@PathVariable("id") String id) {
        User user = repository.getOne(Long.valueOf(id));
        return user;
    }

    @GetMapping("/getAll")
    public List<User> hello(){
        return repository.findAll();
    }
}
