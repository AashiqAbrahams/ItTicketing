package com.aashiq.Factory;

import com.aashiq.Domain.Staff;
import com.aashiq.Util.Misc;

public class StaffFactory {

    public static Staff getStaff(String staffFN){

        return new Staff.Builder().staffID(Misc.generateID()).staffFN(staffFN).build();
    }

}
