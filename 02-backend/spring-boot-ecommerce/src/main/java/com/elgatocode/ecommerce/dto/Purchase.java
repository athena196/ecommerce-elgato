package com.elgatocode.ecommerce.dto;

import com.elgatocode.ecommerce.entity.Address;
import com.elgatocode.ecommerce.entity.Customer;
import com.elgatocode.ecommerce.entity.OrderItem;
import com.elgatocode.ecommerce.entity.Order;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
