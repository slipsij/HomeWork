package ru.snatkin.task23;

public enum ProductType {
    BREAD("Bread"), MILK("Milk"), VEGETABLES("Vegetables");

    String typeName;
    ProductType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
