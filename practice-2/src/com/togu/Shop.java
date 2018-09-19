package com.togu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Shop {
    private List<Item> items = new ArrayList<>();

    public Shop() {}
    public Shop(List<Item> items) {
        this.items = items;
    }

    public void doService(Customer customer, HashMap<String, Integer> request) {
        AtomicInteger total = new AtomicInteger(0);
        request.forEach((name, count) -> {
            Item item = items
                    .stream()
                    .filter(it -> it.name.equals(name))
                    .findFirst()
                    .orElse(null);
            if(item == null) {
                System.out.println("Нет товара с именем " + name);
                return;
            }
            total.set(total.get() + count * item.getPrice());
        });
        if(customer.getMoney() < total.get()) {
            System.out.println("Нет денег");
            return;
        }
        System.out.println("Покупка прошла успешно");
    }
}
