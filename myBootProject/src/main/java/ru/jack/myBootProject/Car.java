package ru.jack.myBootProject;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class Car {
    @Autowired
    Engine engine;

    public void  start() {
        engine.go();
    }
}
