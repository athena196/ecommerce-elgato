package com.elgatocode.ecommerce.service;

import com.elgatocode.ecommerce.dto.Purchase;
import com.elgatocode.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
