package ru.job4j.my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionUsage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");

        Collection<String> list = new ArrayList<>();
        list.addAll(collection);

        for (String string : collection) {
            System.out.println(string);
        }

        collection.remove("two");
        System.out.println("Вывод содержимого коллекции после удаления");
        for (String string : collection) {
            System.out.println(string);
        }

        System.out.println("Размер коллекции равен: " + collection.size());
        System.out.println("Коллекция содержит элемент two: " + collection.contains("two"));
        System.out.println("Содержимое в виде массива: " + Arrays.toString(collection.toArray()));
        collection.clear();
        System.out.println("Коллекция после очистки пуста: " + collection.isEmpty());
    }
}
