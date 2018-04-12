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
    public void addressIdTest() {
        Address address = new Address();
        address.setId(1);
        Integer expected = 1;
        Assert.assertEquals(expected, address.getId());
    }

}
