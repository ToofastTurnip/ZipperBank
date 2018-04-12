package io.zipcoder.model;

import io.zipcoder.bank.model.Address;
import org.junit.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void addressIdTest() {
        Address address = new Address();
        address.setId(1);
        Integer expected = 1;
        Assert.assertEquals(expected, address.getId());
    }

    @Test
    public void addressStreet_numberTest() {
        Address address = new Address();
        address.setStreet_number("555");
        String expected = "555";
        Assert.assertEquals(expected, address.getStreet_number());
    }

    @Test
    public void addressStreet_nameTest() {
        Address address = new Address();
        address.setStreet_name("Highfive Drive");
        String expected = "Highfive Drive";
        Assert.assertEquals(expected, address.getStreet_name());
    }

    @Test
    public void addressCityTest() {
        Address address = new Address();
        address.setCity("Here");
        String expected = "Here";
        Assert.assertEquals(expected, address.getCity());
    }

    @Test
    public void addressStateTest() {
        Address address = new Address();
        address.setState("Here");
        String expected = "Here";
        Assert.assertEquals(expected, address.getState());
    }

    @Test
    public void addressZipTest() {
        Address address = new Address();
        address.setZip("19901");
        String expected = "19901";
        Assert.assertEquals(expected, address.getZip());
    }

}
