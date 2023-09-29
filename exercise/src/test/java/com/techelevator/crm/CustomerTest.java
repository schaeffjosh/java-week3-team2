package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest {
    @Test
    public void getBalanceDueHappyPath(){
        //Arrange
        Customer testObject = new Customer("Ian", "Mcgreal");
        Map<String, Double> balances = new HashMap<String, Double>();
        balances.put("Walking", 10.99);
        balances.put("Grooming", 69.99);
        balances.put("Sitting", 45.99);
        //Act
        double balance = testObject.getBalanceDue(balances);
        //Assert
        Assert.assertEquals(126.97, balance, 0);
    }

    @Test
    public void getBalanceEmptyKeyNoValue(){
        //Arrange
        Customer testObject = new Customer("Ian", "Mcgreal");
        Map<String, Double> balances = new HashMap<String, Double>();
        balances.put("", 0.00);
        //Act
        double balance = testObject.getBalanceDue(balances);
        //Assert
        Assert.assertEquals(0.00, balance, 0);
    }
}
