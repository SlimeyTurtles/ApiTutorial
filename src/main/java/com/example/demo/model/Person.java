package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;

public class Person {
    
    private final UUID id;
    
    @NotBlank
    private final String name;

    private Map<String,Map<String, Object>> orders = new HashMap<>();
    
    public Person(        
            @JsonProperty("id") UUID id, 
            @JsonProperty("name") String name) {
        
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
