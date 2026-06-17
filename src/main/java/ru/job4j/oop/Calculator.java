package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        int resultOne = sum(10);
        System.out.println(resultOne);

        Calculator calculator = new Calculator();
        int resultTwo = calculator.multiply(5);
        System.out.println(resultTwo);

        int taskOne = minus(10);
        System.out.println(taskOne);

        int taskTwo = calculator.divide(25);
        System.out.println(taskTwo);

        int taskThree = calculator.sumAllOperation(5); // (5+5)+(5*5)+(5-5)+(5/5)=36
        System.out.println(taskThree);
    }
}
