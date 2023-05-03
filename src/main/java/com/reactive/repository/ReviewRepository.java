package com.reactive.repository;


import com.reactive.model.Review;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReviewRepository extends ReactiveCrudRepository<Review, Long> {

}




