package com.techelevator.crm;

import com.techelevator.Person;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person {

    private String phoneNumber;
    private List<Pet> pets = new ArrayList<Pet>();

    public String getPhoneNumber(){return this.phoneNumber;}
    public List<Pet> getPets(){return this.pets;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setPets(List<Pet> pets) {this.pets = pets;}

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        new Customer(firstName, lastName, "");
    }

    public double getBalanceDue(Map<String, Double> servicesRendered){
        double total = 0.0;
        for(Map.Entry<String, Double> balance : servicesRendered.entrySet()){
            total += balance.getValue();
        }
        return total;
    }
}
