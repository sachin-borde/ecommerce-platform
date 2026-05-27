package com.ecommerce.orderservice.dto;

public record InventoryResponse(
        String skuCode,
        boolean isInStock
) {
}