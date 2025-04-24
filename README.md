# practica-24-04-2025

![Práctica solución 24-04-2025](https://github.com/Elvis-Aguilar/practica-24-04-2025/blob/main/practica-solucion-24-04-2025.drawio.png)

# Justificacion de cada patron a implementar

## Builder – Construcción flexible de pedidos

En la clase OrderBuilder, que permite construir pedidos (Order) agregando componentes uno por uno (platos, bebidas, extras, combos...).

¿Por qué se usa?

    Un pedido puede ser muy complejo o muy simple.

    Hay componentes obligatorios (como el plato principal) y opcionales (como bebidas o extras).

    Queremos evitar constructores con muchos parámetros y mantener el código legible y escalable


## Composite – Representación de combos y productos individuales

En la interfaz DiscountStrategy y sus implementaciones: FrequentCustomerDiscount, TuesdayPastaDiscount y NoDiscount.

¿Por qué se usa?

    Algunos ítems del pedido son productos simples (una bebida), otros son combos (agrupan varios productos).

    Los combos deben comportarse como un solo producto en términos de precio y nombre.

## Strategy - Aplicación de descuentos dinámicos

    Para aplicar lógicas distintas de descuento dependiendo del tipo de cliente o día.

## Command - Gestión de acciones como enviar/cancelar pedido

Para encapsular acciones como "Enviar", "Cancelar", "Deshacer última acción" y mantener un historial.

¿Por qué se usa?

    El sistema necesita ejecutar acciones como enviar pedido, cancelar, y también deshacer la última acción.

    Las acciones deben encapsularse para facilitar su ejecución, almacenamiento y deshacer.



## Adapter – Integración con el sistema de cocina (XML vs JSON)

Para transformar automáticamente pedidos JSON en el formato XML requerido por el sistema de cocina.

¿Por qué se usa?

    El sistema de atención al cliente trabaja con JSON.

    El sistema de cocina requiere los datos en XML.

    Queremos que esta conversión sea transparente para el usuario.
