package com.aashiq.Factory;

import com.aashiq.Domain.JobRole;

public class JobRoleFactory {

    public static JobRole createJobRole(String jobRoleId, String jobRoleDescription, double jobRoleSalary) {
        return new JobRole.Builder()
                .jobRoleId(jobRoleId)
                .jobRoleDescription(jobRoleDescription)
                .jobRoleSalary(jobRoleSalary)
                .build();
    }
}
