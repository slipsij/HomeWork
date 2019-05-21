package ru.snatkin.task5;

import java.util.Scanner;

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

    public static void main(String[] args) {
        Conductor conductor = new Conductor ("Алексей",23, "Мужчина",true);
        Singer[] singers = new Singer[10];
        //заполнение
        Choir coir = new Choir(conductor, singers);

        System.out.println("Привет! Меня зовут " + conductor.getName() + ", а это мой хор");
        System.out.println("Мы можем спеть любую песню, которую ты выберешь!");
        System.out.println("Напиши Полюшко-поле, что бы мы спели Полюшко-поле");


        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a != "Полюшко-поле") {
            Choir singSong;
        } else {
            System.out.println("Мы не поём");
        }
    }
}




