package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder extends DepartmentBuilder{
    private int studentID;
    private String name;
    private int grade;
    private String department;
    private String email;
    private String address;
    private int age;
    private String state;

    public StudentBuilder setStudentID(int studentID) {
        this.studentID = studentID;
        return this;
    }

    @Override
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setState(String state) {
        this.state = state;
        return this;
    }
    public Student build(){
        return new Student(
                this.studentID, this.name, this.grade, this.department, this.email, this.address, this.age, this.state);
    }
}
