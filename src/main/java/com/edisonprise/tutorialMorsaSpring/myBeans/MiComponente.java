package com.edisonprise.tutorialMorsaSpring.myBeans;

import org.springframework.stereotype.Component;

@Component
public class MiComponente {
    public void saludarDesdeComponente() {
        System.out.println("Saludando desde mi primer componente");
    }
}
