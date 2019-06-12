package com.aashiq.Factory;

import com.aashiq.Domain.Email;

public class EmailFactory {
    public static Email getEmail(String emailAddress) {
        return new Email.Builder().emailAddress(emailAddress).build();
    }
}
