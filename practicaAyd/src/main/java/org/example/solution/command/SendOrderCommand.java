package org.example.solution.command;

import org.example.solution.Order;
import org.example.solution.adapter.KitchenAdapter;

public class SendOrderCommand implements Command {
    private Order order;
    private KitchenAdapter adapter;

    public SendOrderCommand(Order order, KitchenAdapter adapter) {
        this.order = order;
        this.adapter = adapter;
    }

    public void execute() {
        adapter.sendToKitchen(order);
    }

    public void undo() {
        System.out.println("Pedido eliminado de cocina (simulado)");
    }
}