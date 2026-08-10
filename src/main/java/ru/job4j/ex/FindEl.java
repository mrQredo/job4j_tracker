package ru.job4j.ex;

import ru.job4j.tracker.Item;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        /* цикл fori, поскольку нам надо найти индекс искомого элемента в массиве */
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
                return result;
            }
        }
        throw new ElementNotFoundException("ElementNotFoundException");
    }

    public static void main(String[] args) {
        String[] value = {"Gena", "Petya", "Stas"};
        try {
            indexOf(value, "Gena");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}