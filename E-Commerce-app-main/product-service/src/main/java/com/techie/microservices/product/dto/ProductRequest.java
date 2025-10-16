package com.techie.microservices.product.dto;

import java.math.BigDecimal;

public record ProductRequest(String skuCode,
                             String name,
                             String description,
                             BigDecimal price,
                             Integer quantity) {
    // No additional methods or fields are needed here
}
