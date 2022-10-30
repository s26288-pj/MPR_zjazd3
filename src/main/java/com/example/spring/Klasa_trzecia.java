package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Klasa_trzecia {

    ApplicationContext applicationContext;

    public Klasa_trzecia(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;

        Klasa first = applicationContext.getBean("klasa", Klasa.class);
        Klasa_druga second = applicationContext.getBean("klasa_druga", Klasa_druga.class);

        first.speak();
        second.speak();
    }
}
