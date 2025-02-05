package org.example;

import java.util.*;

public class Shop {
    private HashMap<String, Product> products = new HashMap<>();
    private double balance = 0;

    public boolean buyProduct(String productName, double pricing, int count) {
        double sum = count * pricing;
        if (sum > balance) return false;
        balance -= sum;

        Product product = products.get(productName);

        if (product != null) {
            product.addCount(count);
            return true;
        }

        products.put(productName, new Product(productName, pricing, count));
//        System.out.println("Новый продукт создан " + productName + ". Не забудь добавить цену");

        return true;
    }

    public boolean sellProduct(String productName, double price, int count) {
        Product product = products.get(productName);
        if (product == null) return false;

        boolean isSell = product.removeCount(count);

        if (isSell) {
            balance += price;
        }

        return isSell;
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("Нет товаров в магазине.");
        } else {
            System.out.println("Список товаров:");
            for (Product product : products.values()) {
                System.out.println(product.getName() + product.getPrice() + product.getCount());
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setPrice(String productName, double price) {
        boolean trueFalse = true;
        Product product = products.get(productName);
        while (trueFalse) {
            if (price > 0) {
                product.setPrice(price);
                trueFalse = false;
            }
            System.out.println("Цена не может быть меньше единицы!");
        }
    }
}