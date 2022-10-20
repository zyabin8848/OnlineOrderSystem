package com.example.OnlineOrderSystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Food_items")
public class FoodItems {
@Column
    private String foodNeme;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
}
