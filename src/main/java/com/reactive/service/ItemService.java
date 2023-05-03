package com.reactive.service;

import com.reactive.model.Item;
import com.reactive.repository.ItemRepository;
import com.reactive.repository.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

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
        return itemRepository.findItemsWithAverageRatingLowerThan(rating);
    }

    public List<String> getTitles(Double rating) {
        List<String> stringList = new ArrayList<>();
        Flux<String> titles = itemRepository.getTitles(rating);
        titles.collectList().subscribe(stringList::addAll);
        return stringList;
    }

}
