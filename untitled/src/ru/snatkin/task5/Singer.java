package ru.snatkin.task5;

public class Singer extends Person{
   private String timbre;

    public String getTimbre() {
        return timbre;
    }

    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }

    public Singer(String name, int age, String sex, String timbre) {
        super(name, age, sex);
        this.timbre = timbre;
    }
}
