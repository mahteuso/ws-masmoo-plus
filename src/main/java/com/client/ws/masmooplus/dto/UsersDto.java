package com.client.ws.masmooplus.dto;


import com.client.ws.masmooplus.model.SubscriptionsType;
import com.client.ws.masmooplus.model.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDto {

    private Long id;

    @NotBlank(message = " Não poder nmulo ou vazio")
    @Size(min = 5, max = 20, message = " Deve ter tamanho entre 5 e 10 caracteres")
    private String name;

    @Email
    private String email;

    @NotBlank(message = " Não poder nmulo ou vazio")
    @Size(min = 11, max = 11, message = " Deve ter 11 caracteres")
    private String phone;

    @CPF
    private String cpf;

    private LocalDateTime dtSubscription = LocalDateTime.now();

    private LocalDateTime dtExpiration;

    private UserType userType;

    private SubscriptionsType subscriptionsType;
}
