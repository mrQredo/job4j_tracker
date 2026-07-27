package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Наше хранилище будет описывать класс ru.job4j.tracker.Tracker.
 * Объект этого класса будет уметь: добавлять, заменять, искать по имени, читать все сохраненные данные.
 */

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    //Метод indexOf для поиска заявки по id, с возвратом index (номер в массиве)
    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    //0. Добавить новую заявку
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    //1. Показать все заявки
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    //2. Изменить заявку
    public boolean replace(int id, Item item) {
        int index = indexOf(id); //Найти индекс ячейки по id
        boolean result = index != -1;
        if (result) {
            item.setId(id); //Проставить id с item. При замене нужно сохранять старый id.
            items[index] = item; //Записать в ячейку с найденным индексом объект item. Это входящий параметр.
        }
        return result;
    }

    //3. Удалить заявку
    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            System.arraycopy(items, index + 1, items, index, items.length - index - 1);
            items[size - 1] = null;
            size--;
        }
    }

    //4. Показать заявку по id
    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    //5. Показать заявки по имени
    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                    result[count] = item;
                    count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}