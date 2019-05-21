package ru.snatkin.task5;

public class Choir { // один босс и массив певцов
    private Conductor conductor;
    private Singer[] singers;

    public Choir(Conductor conductor, Singer[] singers) {
        this.conductor = conductor;
        this.singers = singers;
    }
    //вызовом кондактора и заставляем петь хор

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
}




