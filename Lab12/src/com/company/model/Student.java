package com.company.model;

public class Student {
    private String name;
    private String surname;
    private int ID;
    private int middleScore;

    public Student(String name, String surname, int ID, int middleScore) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.middleScore = middleScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMiddleScore() {
        return middleScore;
    }

    public void setMiddleScore(int middleScore) {
        this.middleScore = middleScore;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", ID=" + ID +
                ", score=" + middleScore + "}";
    }
}
