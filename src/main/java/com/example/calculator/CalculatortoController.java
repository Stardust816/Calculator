package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class CalculatortoController {

    List<String> animals = new ArrayList<>();

    @GetMapping("/add")
    public String addAnimal(String entry)
    {
        animals.add(entry);
        return "Das Tier " + entry + " wurde hinzugefuegt!";
    }

    @GetMapping("/zoo")
    public String getAnimals()
    {
        return animals.toString();
    }

    @GetMapping("/")
    public String index()
    {
        return "Welcome to the Calculator API";
    }

    @GetMapping("/sum")
    public int Sum(int a, int b)
    {
        return a+b;
    }

}
