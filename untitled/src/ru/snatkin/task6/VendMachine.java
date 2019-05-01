package ru.snatkin.task6;

public class VendMachine {
                    //это поле называется оно drinks. тип массив из элементов типа Drink.
    private Drink[] drinks = new Drink[6];

    public VendMachine(Drink[] drinks) {
        this.drinks = drinks;}




    public VendMachine(){// 13 и 14 Это конструктор по умолчанию, он создает пустой экземпляр класса.
    }                    // Пустой - значит у экземпляра drinks поля не будут заполнены.
                         // У конструктора по умолчанию нет элементов, т.е. в скобках пусто

    public Drink[] getDrinks() {
        return drinks;}

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }
}


