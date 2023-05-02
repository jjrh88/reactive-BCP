package com.reactive.service;

import com.reactive.model.Item;
import com.reactive.model.User;
import com.reactive.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    public Flux<User> findAll() {
        return userRepository.findAll();
    }
}
