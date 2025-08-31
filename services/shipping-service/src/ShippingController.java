package com.globalbooks.shipping;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
    @PostMapping
    public Map<String, Object> ship(@RequestBody Map<String, Object> request) {
        return Map.of(
            "shipmentId", 202,
            "status", "DISPATCHED"
        );
    }
}
