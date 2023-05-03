package com.reactive.repository;


import com.reactive.model.Item;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;


public interface ItemRepository extends ReactiveCrudRepository<Item, Long> {

    @Query("SELECT * FROM Item I LEFT JOIN ReviewItem R ON R.itemid = I.id WHERE I.rating < $1")
    Flux<Item> findItemsWithAverageRatingLowerThan(Double rating);

    @Query("SELECT I.title FROM Item I WHERE I.rating = $1")
    Flux<String> getTitles(Double rating);
}

