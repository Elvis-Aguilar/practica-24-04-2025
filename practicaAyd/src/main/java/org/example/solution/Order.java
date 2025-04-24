package org.example.solution;

import org.example.solution.composite.OrderComponent;
import org.example.solution.strategy.DiscountStrategy;
import org.example.solution.strategy.NoDiscount;

import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private List<OrderComponent> items;
    private DiscountStrategy discount;

    public Order(List<OrderComponent> items) {
        this.items = items;
        this.discount = new NoDiscount();
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public double calculateTotal() {
        double total = items.stream().mapToDouble(OrderComponent::getPrice).sum();
        return discount.applyDiscount(total);
    }

    public String toJson() {
        // Simular JSON
        return items.stream().map(OrderComponent::getName).collect(Collectors.joining(", "));
    }
}

