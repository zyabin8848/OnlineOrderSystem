package com.example.OnlineOrderSystem.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CustomerModel {
    private String custId;
    private String custName;
    private String email;
    private Long phoneNumber;
    private List<FoodItemsModel> foodItems;
    private int [] rateOfNonVeg = FoodCoupon.getPriceOfEachNonVegFoodItems;
    private int [] rateOfVeg = FoodCoupon.priceOfEachVegFoodItems;


}
