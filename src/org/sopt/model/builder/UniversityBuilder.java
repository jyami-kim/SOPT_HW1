package org.sopt.model.builder;
import org.sopt.model.University;

public class UniversityBuilder {
    private int num;
    private String name;
    private int tel;
    private String address;

    public UniversityBuilder setNum(int num) {
        this.num = num;
        return this;
    }

    public UniversityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UniversityBuilder setTel(int tel) {
        this.tel = tel;
        return this;
    }

    public UniversityBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public University build(){
        return new University(this.num, this.name, this.tel, this.address);
    }
}
