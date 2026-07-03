package ru.job4j.oop;

public class PizzaExtraCheese extends Pizza {
    private static final String NAME = " + extra cheese";

    public String name() {
        return super.name() + NAME;
    }
}
