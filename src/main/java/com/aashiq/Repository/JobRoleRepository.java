package com.aashiq.Repository;

import com.aashiq.Domain.JobRole;

import java.util.Set;

public interface JobRoleRepository extends IRepository<JobRole, String> {
    Set<JobRole> getAll();

}