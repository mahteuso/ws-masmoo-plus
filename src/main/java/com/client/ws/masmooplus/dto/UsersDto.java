package com.client.ws.masmooplus.dto;


import com.client.ws.masmooplus.model.SubscriptionsType;
import com.client.ws.masmooplus.model.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDto {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private String cpf;

    private LocalDateTime dtSubscription = LocalDateTime.now();

    private LocalDateTime dtExpiration;

    private UserType userType;

    private SubscriptionsType subscriptionsType;
}
