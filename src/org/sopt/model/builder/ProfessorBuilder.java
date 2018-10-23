package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder extends DepartmentBuilder{
    private int num;
    private String name;
    private String department;
    private int tel;
    private String subject;

    @Override
    public ProfessorBuilder setNum(int num) {
        this.num = num;
        return this;
    }

    @Override
    public ProfessorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProfessorBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public ProfessorBuilder setTel(int tel) {
        this.tel = tel;
        return this;
    }

    public ProfessorBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public Professor build(){
        return new Professor(this.num, this.name, this.department, this.tel, this.subject);
    }
}
