package org.example.solution.adapter;

import org.example.solution.Order;

public class KitchenAdapter {
    public void sendToKitchen(Order order) {
        String xml = convertJsonToXml(order.toJson());
        // Simular envío
        System.out.println("Enviado a cocina en XML:\n" + xml);
    }

    private String convertJsonToXml(String json) {
        // Simulación simple
        return "<order><json>" + json + "</json></order>";
    }
}

