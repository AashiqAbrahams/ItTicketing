package com.aashiq.Factory;

import com.aashiq.Domain.Address;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressFactoryTest {

    String street = "37 Chelmsford";
    String city = "Cape Town";
    String region = "Western Cape";
    String postalCode = "8001";

    Address addresss = AddressFactory.getAddress(street,city,region,postalCode);

    @Test
    public void getAddress() {
        Assert.assertEquals("29 Cessna Crescent",addresss.getCity());
    }
}