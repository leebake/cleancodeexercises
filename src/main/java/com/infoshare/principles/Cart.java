package com.infoshare.principles;

import com.infoshare.comments.redudant.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products;
    private double orderValue;

    public void add(Product product) {
        this.products.add(product);
        this.orderValue = products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void remove(Product product) {
        this.products.remove(product);
        this.orderValue = products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void clear(Product product) {
        this.products = new ArrayList<>();
        this.orderValue = products.stream().mapToDouble(Product::getPrice).sum();
    }

}
