package com.reactive.model;

import java.io.Serializable;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Item")
public class Item implements Serializable {
    @Id
    private Long id;
    private String title;
    private Double rating;
}
