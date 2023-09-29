package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {
    @Test
    public void getBalanceDueHappyPath(){
        //Arrange
        Employee testObject = new Employee("Ian", "Mcgreal");
        Map<String, Double> balances = new HashMap<String, Double>();
        balances.put("Walking", 10.99);
        balances.put("Grooming", 69.99);
        balances.put("Sitting", 45.99);
        //Act
        double balance = testObject.getBalanceDue(balances);
        //Assert
        Assert.assertEquals(121.48, balance, 0);
    }

    @Test
    public void getBalanceDueWholeNumbers(){
        //Arrange
        Employee testObject = new Employee("Ian", "Mcgreal");
        Map<String, Double> balances = new HashMap<String, Double>();
        balances.put("Walking", 10.00);
        balances.put("Grooming", 69.00);
        balances.put("Sitting", 45.00);
        //Act
        double balance = testObject.getBalanceDue(balances);
        //Assert
        Assert.assertEquals(119, balance, 0);
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
