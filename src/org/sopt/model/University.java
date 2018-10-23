package org.sopt.model;

public class University {
    private int univNum;
    private String univName;
    private int univTel;
    private String univAddress;


    public University() {
    }


    public University(int univNum, String univName, int univTel, String univAddress) {
        this.univNum = univNum;
        this.univName = univName;
        this.univTel = univTel;
        this.univAddress = univAddress;
    }

    public int getUnivNum() {
        return univNum;
    }

    public void setUnivNum(int univNum) {
        this.univNum = univNum;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public int getUnivTel() {
        return univTel;
    }

    public void setUnivTel(int univTel) {
        this.univTel = univTel;
    }

    public String getUnivAddress() {
        return univAddress;
    }

    public void setUnivAddress(String univAddress) {
        this.univAddress = univAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "univNum=" + univNum +
                ", univName='" + univName + '\'' +
                ", univTel=" + univTel +
                ", univAddress='" + univAddress + '\'' +
                '}';
    }
}
