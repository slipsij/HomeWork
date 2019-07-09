package ru.snatkin.task23;

import java.util.List;

    interface Baskets {

        void addProduct(String product, int quantity);

        void removeProduct(String product);

        void updateProductQuantity(String product, int quantity, int i);

        void clear();

        List<Product> getProducts();

        int getProductQuantity(String product); // добавить вызов
}


