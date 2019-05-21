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
        Singer[] singers = new Singer[7];
        //заполнение
        singers[0] = new Singer("Катя", 40, "ж", "сопрано");
        singers[1] = new Singer("Оля", 40, "ж", "сопрано");
        singers[2] = new Singer("Женя", 40, "ж", "сопрано");
        singers[3] = new Singer("Антон", 40, "м", "тенор");
        singers[4] = new Singer("Полина", 40, "ж", "сопрано");
        singers[5] = new Singer("Евгения", 40, "ж", "сопрано");
        singers[6] = new Singer("Дада", 40, "ж", "сопрано");
    }
}
