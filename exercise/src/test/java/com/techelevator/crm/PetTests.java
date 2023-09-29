package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {
    @Test
    public void listVaccinationsHappyPath() {
        //Arrange
        Pet testObject = new Pet("Ian", "Hedgehog");
        List<String> vax = new ArrayList<String>(){};
        vax.add("Rabies");
        vax.add("Parvo");
        vax.add("Distemper");
        testObject.setVaccinations(vax);
        //Act
        String vaxString = testObject.listVaccinations();
        //Assert
        Assert.assertEquals("Rabies, Parvo, Distemper", vaxString);
    }

    @Test
    public void listVaccinationsSingleEntry(){
        //Arrange
        Pet testObject = new Pet("Ian", "Hedgehog");
        List<String> vax = new ArrayList<String>(){};
        vax.add("Rabies");
        testObject.setVaccinations(vax);
        //Act
        String vaxString = testObject.listVaccinations();
        //Assert
        Assert.assertEquals("Rabies", vaxString);
    }

    @Test
    public void listVaccinationsEmptyString(){
        //Arrange
        Pet testObject = new Pet("Ian", "Hedgehog");
        List<String> vax = new ArrayList<String>(){};
        vax.add("");
        testObject.setVaccinations(vax);
        //Act
        String vaxString = testObject.listVaccinations();
        //Assert
        Assert.assertEquals("", vaxString);
    }
}
