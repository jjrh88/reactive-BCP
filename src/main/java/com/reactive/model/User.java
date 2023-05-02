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
@Table(name = "UserItem")
public class User implements Serializable {
    @Id
    private Long id;
    private String username;
}
