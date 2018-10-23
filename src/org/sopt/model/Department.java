package org.sopt.model;

public class Department extends University{
    private int num;
    private String name;
    private int tel;
    private String type;

    public Department(){

    }

    public Department(int num, String name, int tel, String type) {
        this.num = num;
        this.name = name;
        this.tel = tel;
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Department{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", tel=" + tel +
                ", type='" + type + '\'' +
                '}';
    }
}
