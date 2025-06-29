package com.cocojumbo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor  // Generates no-arg constructor
@AllArgsConstructor // Generates all-args constructor
public class Catalog {
    private Long id;
    private String name;
    private String description;
}