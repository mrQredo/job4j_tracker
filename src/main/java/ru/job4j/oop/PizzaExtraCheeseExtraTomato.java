package ru.job4j.oop;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String NAME = " + extra tomato";

    public String name() {
        return super.name() + NAME;
    }
}
