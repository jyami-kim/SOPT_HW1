package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder extends UniversityBuilder {

    private int num;
    private String name;
    private int tel;
    private String type;



    public DepartmentBuilder setNum(int depnum) {
        this.num = depnum;
        return this;
    }

    public DepartmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DepartmentBuilder setTel(int tel) {
        this.tel = tel;
        return this;
    }

    public DepartmentBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Department build(){
        return new Department(this.num, this.name, this.tel, this.type);
    }
}
