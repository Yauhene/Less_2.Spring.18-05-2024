package ru.jack.myBootProject;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired
    Car car;

    @GetMapping("/car")
    public String startCar() {
        car.start();
        return "Автомобиль запущен";
    }
}
