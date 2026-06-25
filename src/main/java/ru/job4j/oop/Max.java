package ru.job4j.oop;

public class Max {

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return a > b ? max(a, c) : max(b, c);
    }

    public int max(int a, int b, int c, int d) {
        return a > b ? max(max(a, c), max(a, d)) : max(max(b, c), max(b, d));
    }
}
