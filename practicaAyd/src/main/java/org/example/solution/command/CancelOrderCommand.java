package org.example.solution.command;


import org.example.solution.Order;

public class CancelOrderCommand implements Command {
    private Order order;
    public void execute() {
        System.out.println("Pedido cancelado: " + order);
    }

    public void undo() {
        System.out.println("Cancelación deshecha.");
    }
}