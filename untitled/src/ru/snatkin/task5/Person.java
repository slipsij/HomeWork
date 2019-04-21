package ru.snatkin.task5;

public class Pond extends Water {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
          }

    @Override
    public String toString() {
        return "Pond{" +
                "name='" + name + '\'' +
                '}';
    }
}
