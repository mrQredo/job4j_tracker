package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Автобус движется.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров в автобусе: " + count);
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("Количество топлива в автобусе: " + fuel);
        return fuel;
    }
}
