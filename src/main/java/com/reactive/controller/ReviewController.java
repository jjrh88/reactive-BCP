package com.reactive.controller;


import com.reactive.model.Review;
import com.reactive.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/review")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Review> save(@RequestBody Review review) {
        return reviewService.save(review);
    }


    @GetMapping("/review")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Review> get() {
        return reviewService.findAll();
    }

}
