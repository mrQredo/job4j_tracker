package ru.job4j.polymorphism;

public interface Transport {

    // метод для движения транспорта.
    void move();

    // метод для установки количества пассажиров.
    void passengers(int count);

    // метод для заправки топлива, возвращающий стоимость заправки.
    int refuel(int fuel);
}
