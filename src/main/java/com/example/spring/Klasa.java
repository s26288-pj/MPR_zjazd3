package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Klasa {
    private Klasa_druga klasa_druga;
    ApplicationContext applicationContext;

    public Klasa(Klasa_druga klasa_druga) {
        System.out.println("Hello jeden");
    }

    public void speak() {
        System.out.println("Hau");
    }
}
