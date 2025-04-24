package org.example.solution.strategy;

public class FrequentCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double total) { return total * 0.9; }
}