package com.example.OnlineOrderSystem.controller;

import com.example.OnlineOrderSystem.model.CustomerModel;
import com.example.OnlineOrderSystem.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MainController {
    @Autowired
    private MainService mainService;

    @PostMapping("/saveCustInfo")
    public String  saveCustInfo(@RequestBody List<CustomerModel> customerModel){
        System.out.println("size of the customer list " + customerModel.size());
        String result = this.mainService.saveDetsils(customerModel);
        return result;

    }

    @GetMapping("/custInfoDetails") // http://localhost:8080/custInfoDetails
    public String getInfo(){
        return "Hello All";

    }
}
