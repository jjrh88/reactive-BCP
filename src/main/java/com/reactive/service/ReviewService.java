package com.reactive.service;

import com.reactive.model.Review;
import com.reactive.repository.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public Mono<Review> save(Review review) {
        return reviewRepository.save(review);
    }

    public Flux<Review> findAll() {
        return reviewRepository.findAll();
    }

}
