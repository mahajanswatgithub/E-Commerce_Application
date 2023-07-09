package com.example.ECommerceAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer addressId;
    private String addressName;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;
    @OneToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
}
