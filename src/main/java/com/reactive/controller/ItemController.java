package com.reactive.controller;

import com.reactive.model.Item;
import com.reactive.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/item")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Item> save(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping("/item")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Item> get() {
        return itemService.findAll();
    }


    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Item> findItemsWithAverageRatingLowerThan(@RequestParam(required = false) Double rating) {
        return itemService.findItemsWithAverageRatingLowerThan(rating);
    }

    @GetMapping("/title")
    @ResponseStatus(HttpStatus.OK)
    public Flux<String> getAll(@RequestParam(required = false) Double rating) {
        return itemService.getTitles(rating);
    }

}
