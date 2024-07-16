package com.client.ws.masmooplus.mapper;

import com.client.ws.masmooplus.dto.UserTypeDto;
import com.client.ws.masmooplus.model.UserType;

public class UserTypeMapper {

    public static UserType fromDtoToEntity(UserTypeDto dto) {
        return UserType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .build();
    }
}
