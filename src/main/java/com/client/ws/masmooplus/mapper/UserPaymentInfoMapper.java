package com.client.ws.masmooplus.mapper;

import com.client.ws.masmooplus.dto.UserPaymentInfoDto;
import com.client.ws.masmooplus.model.UserPaymentInfo;
import com.client.ws.masmooplus.model.Users;

public class UserPaymentInfoMapper {

    public static UserPaymentInfo fromDtoToEntity(UserPaymentInfoDto dto, Users users){
        return UserPaymentInfo.builder()
                .id(dto.getId())
                .cardNumber(dto.getCardNumber())
                .cardExpirationMonth(dto.getCardExpirationMonth())
                .cardSecurityCode(dto.getCardSecurityCode())
                .price(dto.getPrice())
                .instalments(dto.getInstalments())
                .dtPayment(dto.getDtPayment())
                .users(users)
                .build();
    }
}
