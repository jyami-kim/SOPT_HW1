package org.sopt.model.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;

public class DepartmentServiceImpl {

    public Department getByDepartmentName(final String getDepartmentName){
        DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        return departmentBuilder
                .setName(getDepartmentName)
                .build();
    }
}
