package com.example.OnlineOrderSystem.service;



public class ValidationService {

    public Boolean validateCustId(String custId) {
        if (custId.startsWith("C0") && custId.length() == 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validPhoneNumeber(Long phoneNunber) {
        String mobNumber = String.valueOf(phoneNunber);
        if (mobNumber != null && mobNumber.length() == 10) {
            return true;

        } else {

            return false;
        }
    }
    public boolean validCustName(String custName){
        if(custName.matches("[a-zA-Z]" )){
            return true;

        } else {
            return false;
        }
    }

}
