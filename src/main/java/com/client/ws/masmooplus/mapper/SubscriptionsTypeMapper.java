package com.client.ws.masmooplus.mapper;

import com.client.ws.masmooplus.dto.SubscriptionsTypeDto;
import com.client.ws.masmooplus.model.SubscriptionsType;

public class SubscriptionsTypeMapper {

    public static SubscriptionsType fromDtoToEntity(SubscriptionsTypeDto dto){
        return SubscriptionsType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .accessMonths(dto.getAccessMonth())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }
}
