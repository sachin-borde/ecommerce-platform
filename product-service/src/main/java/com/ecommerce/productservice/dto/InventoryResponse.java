package com.ecommerce.productservice.dto;

public record InventoryResponse(
        String skuCode,
        boolean isInStock
) {
}