package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class Klasa_druga {
    public Klasa_druga() {
        System.out.println("Hello dwa");
    }

    public void speak() {
        System.out.println("Woof");
    }
}
