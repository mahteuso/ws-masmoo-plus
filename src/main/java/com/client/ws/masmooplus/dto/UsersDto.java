package com.client.ws.masmooplus.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank(message = " Não poder nulo ou vazio")
    @Size(min = 5, message = " Deve ter tamanho mínimo de 5 caracteres")
    private String name;

    @Email(message = " Inválido")
    private String email;

    @NotBlank(message = " Não poder nmulo ou vazio")
    @Size(min = 11, max = 11, message = " Deve ter 11 caracteres")
    private String phone;

    @CPF(message = "Inválido")
    private String cpf;

    private LocalDateTime dtSubscription = LocalDateTime.now();

    private LocalDateTime dtExpiration = LocalDateTime.now();

    @NotNull
    private Long userTypeId;

    private Long subscriptionsTypeId;
}
