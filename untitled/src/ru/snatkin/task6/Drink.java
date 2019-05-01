package ru.snatkin.task6;

public enum Drink {
    BlackTea(1, "Чёрный чай", 50), GreenTea(2, "Зеленый чай", 60),
    VODKA(3, "Водка", 40), SMOOTHIE(4, "Смузи", 500),
    MILK_COCONUT(5, "Кокосовое молоко", 80), BrichJuice(6, "Берёзовый сок", 100);

    Drink(int number, String title, int Price) {
        Number = number;
        Title = title;
        Price = Price;
    }

    public int Number;
    public String Title;
    public int Price;


    public int getNumber() {
        return Number;
    }

    public String getTitle() {
        return Title;
    }

    public double getPrice() {
        return Price;
    }
}



