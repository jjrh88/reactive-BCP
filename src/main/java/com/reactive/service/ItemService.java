package com.reactive.service;

import com.reactive.model.Item;
import com.reactive.repository.ItemRepository;
import com.reactive.repository.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ReviewRepository reviewRepository;

    public Mono<Item> save(Item item) {
        return itemRepository.save(item);
    }

    public Flux<Item> findAll() {
        return itemRepository.findAll();
    }

    public Flux<Item> findItemsWithAverageRatingLowerThan(Double rating) {
        return reviewRepository.findItemsWithAverageRatingLowerThan(rating);
    }

    public Flux<String> getTitles(Double rating) {
        return reviewRepository.getTitles(rating);
    }


    /*public Mono<Item> findById(Long id) {
        return itemRepository
                .findById(id)
                .doOnNext(p -> log.info("Item with id " + p.getId()));
    }

    public Mono<Void> deleteById(Long id) {
        return itemRepository.deleteById(id).doOnNext(c -> log.info("Item with id {} deleted", id));
    }*/

}
