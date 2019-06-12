package com.aashiq.Factory;

import com.aashiq.Domain.StaffName;

public class StaffNameFactory {
    public static StaffName getName(String firstName, String lastName) {
        return new StaffName.Builder().firstName(firstName)
                .lastName(lastName).build();
    }
}
