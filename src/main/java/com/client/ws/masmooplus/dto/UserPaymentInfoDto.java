package com.client.ws.masmooplus.dto;


import com.client.ws.masmooplus.model.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPaymentInfoDto {

    private Long id;

    private String cardNumber;

    private Long cardExpirationMonth;

    private Long cardExpirationYear;

    private String cardSecurityCode;

    private BigDecimal price;

    private Long instalments;

    private LocalDateTime dtPayment = LocalDateTime.now();

    private Users users;
}
