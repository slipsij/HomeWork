package ru.snatkin.task23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserBaskets implements Baskets {

    private Map<Product, Integer> listProducts = new HashMap<>();

    public void addProduct(Product product, int quantity)
    {
        if (this.listProducts.containsKey(product))
        {
            this.listProducts.put(product, this.listProducts.get(product) + (quantity));
        }
        else
        {
            this.listProducts.put(product, quantity);
        }
    }

    public void removeProduct(Product product)
    {
        if (this.listProducts.containsKey(product))
        {
            this.listProducts.put(product, this.listProducts.get(product) - 1);
        } else {
            this.listProducts.remove(product);
        }
    }


    public void updateProductQuantity(Product product, int quantity)
    {
        if (this.listProducts.get(product) > quantity)
        {
            this.listProducts.put(product, this.listProducts.get(product) - quantity);
        }
        else
        {
            this.listProducts.remove(product);
        }

    }


    @Override
    public void addProduct(String product, int quantity) {
    }

    @Override
    public void removeProduct(String product) {
    }

    @Override
    public void updateProductQuantity(String product, int quantity, int i) {
    }

    @Override
    public void clear()
    {
        this.listProducts.clear();
    }


    @Override
    public List<Product> getProducts()
    {
        List<Product> listOfProducts = new ArrayList(this.listProducts.entrySet());
        return listOfProducts;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }


    public int getProductQuantity(Product product)
    {
        int count = this.listProducts.get(product);
        return count;
    }


    public int getCountAllProduct()
    {
        int countProducts = 0;
        for (Map.Entry<Product, Integer> item : this.listProducts.entrySet())
        {
            countProducts = countProducts + item.getValue();
        }
        return countProducts;
    }
}