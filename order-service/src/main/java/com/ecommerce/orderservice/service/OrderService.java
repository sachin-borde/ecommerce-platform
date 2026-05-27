package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.dto.OrderRequest;

public interface OrderService {
    String placeOrder(OrderRequest orderRequest);
}