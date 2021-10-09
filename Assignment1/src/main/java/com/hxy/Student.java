package com.hxy;

public class Student {
    int  NUID;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    int score;
    public Student() {

    }

    public int getNUID() {
        return NUID;
    }

    public void setNUID(int NUID) {
        this.NUID = NUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    String name;
    int age;
    String addr;
}
