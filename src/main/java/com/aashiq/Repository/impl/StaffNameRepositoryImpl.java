package com.aashiq.Repository.impl;

import com.aashiq.Domain.StaffName;
import com.aashiq.Repository.StaffNameRepository;

import java.util.HashSet;
import java.util.Set;

public class StaffNameRepositoryImpl implements StaffNameRepository {

    private static StaffNameRepositoryImpl repository = null;
    private Set<StaffName> names;

    private StaffNameRepositoryImpl(){
        this.names = new HashSet<>();
    }

    public static StaffNameRepository getRepository(){
        if(repository == null) repository = new StaffNameRepositoryImpl();
        return repository;
    }

    @Override
    public Set<StaffName> getAll() {
        return this.getAll();
    }

    @Override
    public StaffName create(StaffName name) {
        this.names.add(name);
        return name;
    }

    @Override
    public StaffName update(StaffName name) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public StaffName read(String s) {
        return null;
    }
}
