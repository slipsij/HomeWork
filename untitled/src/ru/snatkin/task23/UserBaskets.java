package ru.snatkin.task23;

import java.util.*;

public class UserBaskets implements Baskets {

    List<String> selectedProduct = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        int i;
        for (i = 0; i < selectedProduct.size(); i+=2) {
            if (product.equalsIgnoreCase(selectedProduct.get(i))) {
                updateProductQuantity(product, quantity, i);
                break;
            }
        }
        if(i == selectedProduct.size()) {
            selectedProduct.add(product);
            selectedProduct.add(String.valueOf(quantity));
        }
    }

    @Override
    public void removeProduct(String product) {
        for (int i = 0; i < selectedProduct.size(); i+=2) {
            if(product.equalsIgnoreCase(selectedProduct.get(i))) {
                selectedProduct.remove(i);
                selectedProduct.remove(i);
            }
        }
        System.out.println("Done!");
        System.out.println();
    }

    @Override
    public void updateProductQuantity(String product, int quantity, int index) {
        selectedProduct.set(index + 1, String.valueOf(quantity));
    }


    @Override
    public void clear() {
        selectedProduct.clear();
        System.out.println("Done!");
    }

    @Override
    public List<String> getProducts() {
        return selectedProduct;
    }

    @Override
    public int getProductQuantity(String product) {
        return Collections.frequency(selectedProduct, product);
    }
}
