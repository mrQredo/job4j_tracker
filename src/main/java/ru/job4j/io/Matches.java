package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            /* Остальная логика игры. */
            if (matches > 3 || matches <= 0) {
                System.out.println("Введено неверное число!");
            } else if (matches > count) {
                System.out.println("Введено число больше остатка спичек! Остаток: " + count);
            } else {
                switch (matches) {
                    case 1:
                        System.out.println(player + " взял " + matches + " спичку.");
                        break;
                    case 2, 3:
                        System.out.println(player + " взял " + matches + " спички.");
                        break;
                }
                count = count - matches;
                switch (count) {
                    case 1:
                        System.out.println("Осталась " + count + " спичка");
                        break;
                    case 2, 3, 4:
                        System.out.println("Осталось " + count + " спички");
                        break;
                    case 5, 6, 7, 8, 9, 10, 11:
                        System.out.println("Осталось " + count + " спичек");
                        break;
                }
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
