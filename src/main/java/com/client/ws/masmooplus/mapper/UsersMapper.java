package com.client.ws.masmooplus.mapper;

import com.client.ws.masmooplus.dto.UsersDto;
import com.client.ws.masmooplus.model.SubscriptionsType;
import com.client.ws.masmooplus.model.UserType;
import com.client.ws.masmooplus.model.Users;

public class UsersMapper {

   public static Users fromDtoToEntity(UsersDto dto, UserType userType, SubscriptionsType subscriptionsType){
        return Users.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .cpf(dto.getCpf())
                .dtSubscription(dto.getDtSubscription())
                .dtExpiration(dto.getDtExpiration())
                .userType(userType)
                .subscriptionsType(subscriptionsType)
                .build();
    }
}
