package ru.jack.myBootProject;

import org.springframework.stereotype.*;

@Component
public class Engine {
    public Engine() {
        System.out.println("Двигатель запущен");
    }

    public void go() {
        System.out.println("Поехали!");
    }
}
