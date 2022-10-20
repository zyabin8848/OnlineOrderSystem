package com.example.OnlineOrderSystem.service;

import com.example.OnlineOrderSystem.entity.Customer;
import com.example.OnlineOrderSystem.entity.FoodItems;
import com.example.OnlineOrderSystem.model.CustomerModel;
import com.example.OnlineOrderSystem.model.FoodItemsModel;
import com.example.OnlineOrderSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private CustomerRepository customerRepository;

    public String saveDetsils(List<CustomerModel> customerModels) {
        for (CustomerModel customerModel : customerModels) {
            Customer customer = new Customer();
            ValidationService validationService = new ValidationService();
            if (validationService.validateCustId(customerModel.getCustId())) {
                customer.setCustId(customerModel.getCustId());
            } else {
                return "Customer id is not valid";
            }

            if (validationService.validPhoneNumeber(customerModel.getPhoneNumber())){
                customer.setPhoneNumber(customer.getPhoneNumber());
            } else {
                return "PhoneNumber is not Valid ! enter 10 digits of number " ;
            }
            if(validationService.validCustName(customerModel.getCustName())){
                customer.setCustName(customerModel.getCustName());
            }else {
                return "Customer Name is not valid ! please Enter only character ";
            }
            customer.setEmail(customerModel.getEmail());

            List<FoodItemsModel> foodItemsModels = customerModel.getFoodItems();
            for(FoodItemsModel foodItemsModel : foodItemsModels){
                FoodItems foodItems = new FoodItems();
                foodItems.setFoodNeme(foodItemsModel.getFoodNeme());

                customer.addDetails(foodItems);
            }
            this.customerRepository.save(customer);

        }
        return "Customer Information saved Successfully";
    }
}
