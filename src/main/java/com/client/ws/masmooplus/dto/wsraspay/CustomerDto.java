package com.client.ws.masmooplus.dto.wsraspay;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private String id;

    private String cpf;

    private String email;

    private String firstName;

    private String lastName;
}
