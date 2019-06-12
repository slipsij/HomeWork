package ru.snatkin.task23;

public class Product {
    private ProductType type;
    private String name;

    public Product(ProductType type, String name) {
        this.type = type;
        this.name = name;

    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
