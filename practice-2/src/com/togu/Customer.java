package com.togu;

import java.util.HashMap;

public class Customer {
    private int money;

    public Customer() {}
    public Customer(int money) {this.money = money;}

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void requestOrder(HashMap<String, Integer> request, Shop shop) {
        shop.doService(this, request);
    }
}
