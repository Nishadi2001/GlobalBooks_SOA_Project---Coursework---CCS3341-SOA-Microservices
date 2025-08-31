package com.globalbooks.payments;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
    @PostMapping
    public Map<String, Object> pay(@RequestBody Map<String, Object> request) {
        return Map.of(
            "paymentId", 101,
            "status", "SUCCESS"
        );
    }
}
