package ru.snatkin.task6;

public class VendMachine {
                    //это поле называется оно drinks. тип - массив из элементов типа Drink.
    private Drink2[] drinks = new Drink2[6];
    public VendMachine(Drink2[] drinks) {
        this.drinks = drinks;
    } public VendMachine() {// 13 и 14 Это конструктор по умолчанию, он создает пустой экземпляр класса.
    }                    // Пустой - значит у экземпляра drinks поля не будут заполнены.
                         // У конструктора по умолчанию нет элементов, т.е. в скобках пусто
    public Drink2[] getDrinks() {
        return drinks;
    } public void setDrinks(Drink2[] drinks) {
        this.drinks = drinks;
    }
}


