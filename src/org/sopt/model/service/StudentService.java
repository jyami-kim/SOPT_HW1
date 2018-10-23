package org.sopt.model.service;

import org.sopt.model.Student;

public interface StudentService {
    //학번으로 학생 조희
    Student getByStudentIdx(final int getStudentIdx);
}
