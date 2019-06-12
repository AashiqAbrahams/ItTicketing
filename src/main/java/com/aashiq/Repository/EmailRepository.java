package com.aashiq.Repository;

import com.aashiq.Domain.Email;

import java.util.Set;

public interface EmailRepository extends IRepository<Email,String> {
    Set<Email> getAll();
}
