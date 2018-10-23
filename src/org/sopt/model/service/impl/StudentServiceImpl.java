package org.sopt.model.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public Student getByStudentIdx(final int studentIdx) {
        final StudentBuilder studentBuilder = new StudentBuilder();
        return studentBuilder
                .setStudentID(studentIdx)
                .build();
    }
}
