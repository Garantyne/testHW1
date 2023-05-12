package com.example.testhw1.controller;

import com.example.testhw1.exception.NullDivideException;
import com.example.testhw1.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping
@RestController
public class Controller {
    public final Service  service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping()
    public String welcom() {
        return "Привет чувак! Ты попал в калькулятор)";
    }

    @GetMapping(value = "/plus")
    public int plus(@RequestParam(value = "num1") int a,
                    @RequestParam(value = "num2") int b)throws NullPointerException {
        return service.plus(a,b);
    }
    @GetMapping(value = "/minus")
    public int minus(@RequestParam(value = "num1") int a,
                    @RequestParam(value = "num2") int b)throws NullPointerException {
        return service.minus(a,b);
    }
    @GetMapping(value = "/multiply")
    public int multiply(@RequestParam(value = "num1") int a,
                    @RequestParam(value = "num2") int b)throws NullPointerException {

        return service.multyply(a,b);
    }
    @GetMapping(value = "/divide")
    public double divide(@RequestParam(value = "num1") int a,
                    @RequestParam(value = "num2") int b)throws IllegalAccessException {

        return service.devided(a,b);
    }
}
