package test.cafe;

//package org.springframework.integration.samples.cafe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    public List<OrderItem> orderItems = new ArrayList<OrderItem>();
    private int number;

    public Order() {}
    public Order(int number) {
        this.number = number;
    }

    public void addItem(DrinkType drinkType, int shots, boolean iced) {
        this.orderItems.add(new OrderItem(this.number, drinkType, shots, iced));
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<OrderItem> getItems() {
        return this.orderItems;
    }

    public void setItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
