package com.aashiq.Domain;

public class StaffName {
    private String firstName, lastName;

    private StaffName() {
    }

    private StaffName(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private String firstName, lastName;


        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StaffName build(){return new StaffName(this);}

    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
