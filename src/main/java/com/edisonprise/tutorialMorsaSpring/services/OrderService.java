package com.edisonprise.tutorialMorsaSpring.services;

import com.edisonprise.tutorialMorsaSpring.Rutas;
import com.edisonprise.tutorialMorsaSpring.models.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OrderService {

    private final Logger logger = LoggerFactory.getLogger(OrderService.class);
    public void saveOrder(List<Producto> productos) {
        System.out.println("Guardando en la base de datos...");
        productos.forEach(producto -> logger.debug("el nombre del producto: {}", producto.nombre));

    }
}
