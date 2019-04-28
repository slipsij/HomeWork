package ru.snatkin.task6;

public enum Drink {

    BlackTea(1, "Чёрный чай", 50), GreenTea(2, "Зеленый чай", 60),
    VODKA(3, "Водка", 40), SMOOTHIE(4, "Смузи", 500),
    MILK_COCONUT(5, "Кокосовое молоко", 80), BrichJuice(6, "Берёзовый сок", 100);

    Drink(int number, String title, double price) {
        Number = number;
        Title = title;
        Price = price;

    }

    private String number;
    Drink drink = Drink.valueOf();
    public int Number;
    public String Title;
    public double Price;

    // почему это тут?
    Drink(int Number){
        this.Number = Number;
        drink = Drink.valueOf(this.Number);
    }
    //почему это он не спрашивает?
    Drink(String Title){
        this.Title = Title;
        drink = Drink.valueOf(Number);
    }

    Drink(double Price){
        this.Price = Price;
        drink = Drink.valueOf(Number);
    }

    public int getNumber() {
        return Number;
    }

    public String getTitle() {
        return Title;
    }

    public double getPrice() {
        return Price;
    }

    public static void main(String[] args) {
        Drink n = Drink.BlackTea;
    }
}



