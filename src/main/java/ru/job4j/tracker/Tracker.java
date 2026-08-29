package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Наше хранилище будет описывать класс ru.job4j.tracker.Tracker.
 * Объект этого класса будет уметь: добавлять, заменять, искать по имени, читать все сохраненные данные.
 */

public class Tracker {
    private final List<Item> items = new ArrayList<>(); // Список заявок: ArrayList растёт автоматически, поэтому не нужен size.
    private int ids = 1;

    //Метод indexOf для поиска заявки по id, с возвратом index (номер в массиве)
    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    //0. Добавить новую заявку
    public Item add(Item item) {
        item.setId(ids++); // // Присваиваем заявке новый id
        items.add(item); // добавляет элемент в конец
        return item;
    }

    //1. Показать все заявки
    public List<Item> findAll() {
        return new ArrayList<>(items); // Возвращаем копию списка
    }

    //2. Изменить заявку
    public boolean replace(int id, Item item) {
        int index = indexOf(id); //Найти индекс ячейки по id
        boolean result = index != -1; // заявка найдена?
        if (result) {
            item.setId(id); // сохраняем старый id при замене
            items.set(index, item); // записываем item на позицию index
        }
        return result;
    }

    //3. Удалить заявку
    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (index != -1) {
            items.remove(index);   // удалить элемент по индексу, список сам сдвинет остальные
        }
    }

    //4. Показать заявку по id
    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items.get(index) : null;
    }

    //5. Показать заявки по имени
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {           // перебираем все заявки списка
            if (key.equals(item.getName())) {
                result.add(item);           // подходящие добавляем в результат
            }
        }
        return result;
    }
}