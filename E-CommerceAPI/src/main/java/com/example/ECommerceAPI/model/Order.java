package com.example.ECommerceAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer orderId;
    private Integer productQuantity;

    @ManyToOne
    @JoinColumn(name = "fk_user_Id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Product product;

}
