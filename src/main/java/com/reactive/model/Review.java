package com.reactive.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "ReviewItem")
public class Review implements Serializable{
    @Id
    private Long id;
    private Long itemid;
    private Long userid;
}
