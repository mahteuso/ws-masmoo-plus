package com.client.ws.masmooplus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
@Entity
@Table(name = "subscriptions_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionsType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private Long id;

    private String name;

    @Column(name = "access_months")
    private Integer accessMonths;

    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey;
}
