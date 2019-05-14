package ru.snatkin.task5;

public class Choir { // один босс и массив певцов
    private Conductor conductor;
    private Singer[] singers = new Singer[10];

    public Choir(Conductor conductor, Singer[] singers) {
        this.conductor = conductor;
        this.singers = singers;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Singer[] getSingers() {
        return singers;
    }

    public void setSingers(Singer[] singers) {
        this.singers = singers;
    }

    public static void main(String[] args) {
        Conductor conductor = new Conductor();
        Singer[] singers = new Singer[10];
        //заполнение
        Choir coir = new Choir(conductor, singers);

    }
}
