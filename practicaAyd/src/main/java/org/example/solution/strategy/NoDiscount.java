package org.example.solution.strategy;

public class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double total) { return total; }
}