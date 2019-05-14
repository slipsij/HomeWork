package ru.snatkin.task5;

public class Singer extends Person{
    private boolean Power = false;
    private String Timbre;

    public boolean isPower() {
        return Power;
    }

    public void setPower(boolean power) {
        Power = power;
    }

    public String getTimbre() {
        return Timbre;
    }

    public void setTimbre(String timbre) {
        Timbre = timbre;
    }
}
