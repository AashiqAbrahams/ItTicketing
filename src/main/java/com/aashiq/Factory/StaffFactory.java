package com.aashiq.Factory;

import com.aashiq.Domain.StaffName;
import com.aashiq.Util.Misc;

public class StaffFactory {

    public static StaffName getStaff(String staffFN){

        return new StaffName.Builder().staffID(Misc.generateID()).staffFN(staffFN).build();
    }

}
