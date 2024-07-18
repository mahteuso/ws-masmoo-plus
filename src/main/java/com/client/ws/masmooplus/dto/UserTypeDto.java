package com.client.ws.masmooplus.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTypeDto {

    private Long id;

    @NotBlank(message = " Não pode ser nulo ou vazio")
    @Size(min = 8, max = 20, message = " Deve ter tamanho entre 8 e 20 caracteres")
    private String name;

    @NotBlank(message = " Não pode ser nulo ou vazio")
    @Size(min = 8, max = 200)
    private String description;
}
