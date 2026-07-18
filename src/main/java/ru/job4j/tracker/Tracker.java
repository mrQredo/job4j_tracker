package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    //добавление новых заявок
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    //получение списка всех заявок
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    //получение списка заявок по имени
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

    //получение заявки по id, возврат самой заявки - item
    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    //метод для поиска по id, с возвратом index (номер в массиве)
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

    //метод замены заявки
    public boolean replace(int id, Item item) {
        int index = indexOf(id); //Найти индекс ячейки по id
        boolean result = index != -1;
        if (result) {
            item.setId(id); //Проставить id с item. При замене нужно сохранять старый id.
            items[index] = item; //Записать в ячейку с найденным индексом объект item. Это входящий параметр.
        }
        return result;
    }

    //метод удаления заявки
    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            System.arraycopy(items, index + 1, items, index, items.length - index - 1);
            items[size - 1] = null;
            size--;
        }
    }
}