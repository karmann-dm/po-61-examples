package com.togu;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(Arrays.asList(
                new Bread(),
                new Sausage(),
                new Tea()
        ));
        Customer customer = new Customer(1000);
        HashMap<String, Integer> order = new HashMap<>();
        order.put("Колбаса", 1);
        order.put("Хлеб", 2);
        order.put("Чай", 1);
        order.put("Вввв", 1);

        customer.requestOrder(order, shop);
    }
}
