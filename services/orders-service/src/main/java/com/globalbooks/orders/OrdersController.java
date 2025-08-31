package com.globalbooks.orders;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {
    private Map<Integer, String> orders = new HashMap<>();
    private int counter = 1;

    @PostMapping
    public Map<String,Object> createOrder(@RequestBody Map<String,Object> payload) {
        orders.put(counter, "NEW");
        return Map.of("id", counter++, "status", "NEW");
    }

    @GetMapping("/{id}")
    public Map<String,Object> getOrder(@PathVariable int id) {
        return Map.of("id", id, "status", orders.getOrDefault(id, "UNKNOWN"));
    }
}
