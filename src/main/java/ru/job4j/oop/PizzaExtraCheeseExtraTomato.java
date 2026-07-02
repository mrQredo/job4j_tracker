package ru.job4j.oop;

public class PizzaExtraCheeseExtraTomato extends Pizza {
    private static final String NAME = " + extra cheese + extra tomato";

    public String name() {
        return "Just tasty pizza" + NAME;
    }
}
