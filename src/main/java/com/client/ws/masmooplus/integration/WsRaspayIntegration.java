package com.client.ws.masmooplus.integration;

import com.client.ws.masmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.masmooplus.dto.wsraspay.OrderDto;
import com.client.ws.masmooplus.dto.wsraspay.PaymentDto;

public interface WsRaspayIntegration {

    CustomerDto createCustmomer(CustomerDto dto);

    OrderDto createOrder(OrderDto dto);

    Boolean processPayment(PaymentDto dto);
}
