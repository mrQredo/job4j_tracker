package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Следующей задачей в нашем проекте будет отображение меню - ru.job4j.tracker.StartUI.
 * Этот объект будет управлять меню. В нем будет цикл, который будет опрашивать пользователя о выбранном пункте меню.
 * Если пользователь выбрал пункт "Выйти", то цикл завершается и программа закрывается.
 */

public class StartUI {

    //Метод init инициализирует приложение и запускает выполнение различных пользовательских действий.
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Выбрать: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select != 6) {
                System.out.println("Пользователь выбрал: " + select);
            } else {
                run = false;
            }
        }
    }

    //Метод showMenu выводит на экран меню доступных пользовательских действий.
    private void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени",
                "Завершить программу"
        };
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}