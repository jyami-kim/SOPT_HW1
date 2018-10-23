package org.sopt.model.service;

import org.sopt.model.Department;

public interface DepartmentService {
    //학과 이름으로 조회
    Department getByDepartmentName(final String getDepartmentName);
}
