package com.aashiq.Repository;

import com.aashiq.Domain.Address;

import java.util.Set;

public interface AddressRepository extends IRepository<Address, String>{
    Set<Address> getAll();
}
