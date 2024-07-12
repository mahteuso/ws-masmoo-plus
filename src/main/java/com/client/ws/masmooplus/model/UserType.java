package com.client.ws.masmooplus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_type")
public class UserType implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "user_type_id")
    private Long id;

    private String name;

    private String description;
}
