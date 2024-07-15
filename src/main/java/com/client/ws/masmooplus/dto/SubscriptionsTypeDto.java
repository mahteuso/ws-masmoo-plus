package com.client.ws.masmooplus.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionsTypeDto {

    private Long id;

    private String name;

    private Integer accessMonth;

    private BigDecimal price;

    private String productKey;
}
