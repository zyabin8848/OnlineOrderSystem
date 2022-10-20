package com.example.OnlineOrderSystem.entity;

import com.example.OnlineOrderSystem.model.FoodItemsModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Cust_info")
public class Customer {
@Id
    private String custId;
    @Column
    private String custName;
    @Column
    private String email;
    @Column
    private Long phoneNumber;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<FoodItems> foodItems = new ArrayList<>();

    public void addDetails(FoodItems foodItems) {
        this.foodItems.add(foodItems);

    }
}
