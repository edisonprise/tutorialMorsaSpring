package com.edisonprise.tutorialMorsaSpring.services;

import com.edisonprise.tutorialMorsaSpring.Rutas;
import com.edisonprise.tutorialMorsaSpring.models.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

public class OrderService implements IOrderService {

    @Value("${misurls.database}")
    private String databaseurl;

    private final Logger logger = LoggerFactory.getLogger(OrderService.class);
    public void saveOrder(List<Producto> productos) {
        System.out.println("Guardando en la base de datos, la url: " + databaseurl);
        productos.forEach(producto -> logger.debug("el nombre del producto: {}", producto.nombre));

    }
}
