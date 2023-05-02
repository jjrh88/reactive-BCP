package com.reactive.controller;

import com.reactive.model.User;
import com.reactive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<User> save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public Flux<User> get() {
        return userService.findAll();
    }
}
