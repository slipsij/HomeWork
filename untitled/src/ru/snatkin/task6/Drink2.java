package ru.snatkin.task6;

public enum Drink2 {
    OrangeTea("Оранжевый чай", 50), PurpleTea("Фиолетовый чай", 60),
    VODochka("Водочка", 40), SMOO("Смузон", 500),
    MILK_COC("Кокоса молоко", 80), RichJuice("Берёзы сок", 100);

    Drink2(String titlete, int pricero){
        Price = pricero;
        Title = titlete;}

    private int Price;
    private String Title;


    public int getPrice() {
        return Price;
    }

    public String getTitle() {
        return Title;
    }
}

