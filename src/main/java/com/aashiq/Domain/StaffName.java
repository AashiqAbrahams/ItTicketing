package com.aashiq.Domain;

import javafx.util.Builder;

import java.util.Set;

public class StaffName {

    private String staffFN, staffLN, staffID;

    private StaffName(){}

    private StaffName(Builder builder){

        this.staffFN = builder.staffFN;
        this.staffLN = builder.staffLN;
        this.staffID = builder.staffID;
    }


    public String getStaffFN(){
        return staffFN;
    }

    public String getStaffLN(){
        return staffLN;
    }

    public String getStaffID(){
        return staffID;
    }

    public static class Builder {

        private String staffFN, staffLN, staffID;

        public Builder staffFN(String staffFN){
            this.staffFN = staffFN;
            return this;
        }

        public Builder staffLN(String staffLN){
            this.staffLN = staffLN;
            return this;
        }

        public Builder staffID(String staffID){
            this.staffID = staffID;
            return this;
        }

        public StaffName build(){

            return new StaffName (this);
        }



    }
    @Override
    public String toString(){
        return "Staff First Name: " + staffFN + "/n/n" + "Staff Last Name: " + staffLN + "/n/n" + "Staff ID: " + staffID;
    }
}