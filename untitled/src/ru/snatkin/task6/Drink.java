package ru.snatkin.task6;

public enum Drink {
    BLACK_TEA(1, "Чёрный чай", 50), GREEN_TEA(2, "Зеленый чай", 50),
    VODKA(3, "Водка", 100), SMOOTHIE(4, "Смузи", 100),
    MILK_COCONUT(5, "Кокосовое молоко", 100), BRICH_JUICE(6, "Берёзовый сок", 100);

    Drink(int Number, String Title, int Price) {
        this.Number = Number;
        this.Title = Title;
        this.Price = Price;
    }

    private int Number;
    private String Title;
    private int Price;


    public int getNumber() {
        return Number;
    }

    public String getTitle() {
        return Title;
    }

    public int getPrice() {
        return Price;
    }

git co
}


