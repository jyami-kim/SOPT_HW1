package org.sopt.model;

public class Professor extends Department{
    private int num;
    private String name;
    private String department;
    private int tel;
    private String subject;

    public Professor(){}

    public Professor(int num, String name, String department, int tel, String subject) {
        this.num = num;
        this.name = name;
        this.department = department;
        this.tel = tel;
        this.subject = subject;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int getTel() {
        return tel;
    }

    @Override
    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", tel=" + tel +
                ", subject='" + subject + '\'' +
                '}';
    }
}
