package org.sopt.model;

public class Student extends Department{
    private int studentID;
    private String name;
    private int grade;
    private String department;
    private String email;
    private String address;
    private int age;
    private String state;

    public Student (){}

    public Student(int studentID, String name, int grade, String department, String email, String address, int age, String state) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
        this.department = department;
        this.email = email;
        this.address = address;
        this.age = age;
        this.state = state;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", department=" + department +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", state='" + state + '\'' +
                '}';
    }
}
