package ru.job4j.tracker.input;

/**
 * Интерфейс ru.job4j.tracker.input.Input, который отвечает за ввод данных от пользователя.
 * Этим интерфейсом мы и будем заменять Scanner.
 */

public interface Input {

    String askStr(String question);

    int askInt(String question);
}
