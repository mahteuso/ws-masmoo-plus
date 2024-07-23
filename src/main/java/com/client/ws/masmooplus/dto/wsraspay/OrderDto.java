package com.client.ws.masmooplus.dto.wsraspay;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private String id;

    private String customerId;

    private Long discount;

    private String productAcronym;
}
