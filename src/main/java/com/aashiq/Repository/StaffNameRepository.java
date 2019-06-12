package com.aashiq.Repository;

import com.aashiq.Domain.StaffName;

import java.util.Set;

public interface StaffNameRepository extends IRepository<StaffName,String>{
    Set<StaffName> getAll();
}
