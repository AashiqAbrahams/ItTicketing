package com.aashiq.Factory;

import com.aashiq.Domain.Address;

public class AddressFactory {
    public static Address getAddress(String street, String city, String region, String postalCode){
        return new Address.Builder().street(street)
                .city(city)
                .region(region)
                .postalCode(postalCode).build();

    }
}
