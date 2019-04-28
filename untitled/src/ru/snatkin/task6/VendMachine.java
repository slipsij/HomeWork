package ru.snatkin.task6;

public class VendMachine {
    private int Number;
    private String Title;
    public double Price;


    public VendMachine (int Number, String Title, double Price) {
        this.Price = Price;
        this.Title = Title;
        this.Number = Number;
    }

    public VendMachine(Drink milkCoconut) {

    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "VendMachine{" +
                "Number=" + Number +
                ", Title='" + Title + '\'' +
                ", Price=" + Price +
                '}';
    }
}
