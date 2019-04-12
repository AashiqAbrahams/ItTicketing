package com.aashiq.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import com.aashiq.Domain.Staff;


public class StaffFactoryTest {

    @Test
    public void getStaff(){

        String firstName = "Aashiq";
        Staff fn = StaffFactory.getStaff(firstName);
        System.out.println(fn);
        Assert.assertNotNull(fn.getStaffID());
    }

}