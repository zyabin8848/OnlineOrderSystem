package com.example.OnlineOrderSystem.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodItemsModel {
    private String foodNeme;
    private VegFoodCoupon [] vegFoodCoupons;
    private NonVegFoodCoupon [] nonVegFoodCoupons;

}
