package org.sopt;

import org.sopt.model.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final ArrayList<Student> studentList = new ArrayList<Student>();

        final Student student1 = new Student();
        final Student student2 = new Student();
        final Student student3 = new Student();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for(final Student s: studentList){
            System.out.println(s.toString());
        }
    }
}
