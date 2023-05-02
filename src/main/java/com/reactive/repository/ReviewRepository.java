package com.reactive.repository;


import com.reactive.model.Item;
import com.reactive.model.Review;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ReviewRepository extends ReactiveCrudRepository<Review, Long> {

    @Query("SELECT * FROM ReviewItem R JOIN Item I ON R.itemID = I.id WHERE R.rating =:rating ")
    Flux<Item> findItemsWithAverageRatingLowerThan(@Param("rating") Double rating);

    @Query("SELECT I.title FROM ReviewItem R JOIN Item I ON R.itemID = I.id WHERE R.rating =:rating ")
    Flux<String> getTitles(Double rating);
}




