package org.example.solution.builder;

import org.example.solution.Order;
import org.example.solution.composite.OrderComponent;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private List<OrderComponent> items = new ArrayList<>();

    public OrderBuilder addItem(OrderComponent item) {
        items.add(item);
        return this;
    }

    public Order build() {
        return new Order(items);
    }
}
