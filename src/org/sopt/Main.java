package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final ArrayList<ArrayList> listSet = new ArrayList<ArrayList>();
        final ArrayList<Student> studentList = new ArrayList<Student>();
        final ArrayList<University> universities = new ArrayList<University>();
        final ArrayList<Department> departments = new ArrayList<Department>();
        final ArrayList<Professor> professors = new ArrayList<Professor>();

        for(int i = 0; i < 3; i++) {
            studentList.add(new Student());
            universities.add(new University());
            departments.add(new Department());
            professors.add(new Professor());
        }

        listSet.add(studentList);
        listSet.add(universities);
        listSet.add(departments);
        listSet.add(professors);

        for(Student s: studentList) {
            System.out.println(s.toString());
        }
        for(University u : universities){
            System.out.println(u.toString());
        }
        for(Department d : departments){
            System.out.println(d.toString());
        }
        for(Professor p : professors){
            System.out.println(p.toString());
        }

    }
}
