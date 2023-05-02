package com.reactive.repository;


import com.reactive.model.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface ItemRepository extends ReactiveCrudRepository<Item, Long> {

}

