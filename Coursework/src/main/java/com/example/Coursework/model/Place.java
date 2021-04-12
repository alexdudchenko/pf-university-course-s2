package com.example.Coursework.model;

import java.util.Objects;

public class Place {
    private int number;
    private boolean isFree;
    //private String phoneNumber;

    public Place(int number, boolean isFree) {
        this.number = number;
        this.isFree = isFree;
    }

    public Place(int number) {
        this.number = number;
        this.isFree = true;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return number == place.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Place{" +
                "number=" + number +
                ", isFree=" + isFree +
                '}';
    }
}
