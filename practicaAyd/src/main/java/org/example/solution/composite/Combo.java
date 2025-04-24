package org.example.solution.composite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements OrderComponent {
    private List<OrderComponent> components = new ArrayList<>();
    private String name;

    public Combo(String name) {
        this.name = name;
    }

    public void addComponent(OrderComponent component) {
        components.add(component);
    }

    public double getPrice() {
        return components.stream().mapToDouble(OrderComponent::getPrice).sum();
    }

    public String getName() {
        return name;
    }
}
