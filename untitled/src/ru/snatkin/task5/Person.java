package ru.snatkin.task5;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate BirthDay;
    private int PassNumber;

    public LocalDate getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        BirthDay = birthDay;
    }

    public int getPassNumber() {
        return PassNumber;
    }

    public void setPassNumber(int passNumber) {
        PassNumber = passNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
          }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", BirthDay=" + BirthDay +
                ", PassNumber=" + PassNumber +
                '}';
    }
}
