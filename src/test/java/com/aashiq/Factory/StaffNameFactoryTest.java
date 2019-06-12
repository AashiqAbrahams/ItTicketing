package com.aashiq.Factory;

import com.aashiq.Domain.StaffName;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffNameFactoryTest {

    String firstName = "Jade";
    String lastName = "Kearns";

    StaffName name = StaffNameFactory.getName(firstName,lastName);

    @Test
    public void getFirstName() {

        Assert.assertEquals("Jade", name.getFirstName());

    }

    @Test
    public void getLastName() {

        Assert.assertEquals("Kearns", name.getLastName());

    }
}
