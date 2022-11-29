package com.example.demo.model;

import java.util.Map;
import java.util.UUID;

public class Order {
    
    private final UUID id;
    private final Person person;
    private final Map<String, Map<String, Object>> cart;
    /* 
    "orders": {
        "id": 21
        "user": person
        "cart": [
        
            ]
            
            
            
        }
    }
    */
}
