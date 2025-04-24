package org.example.solution.strategy;

public class TuesdayPastaDiscount implements DiscountStrategy {
    public double applyDiscount(double total) { return total * 0.85; }
}