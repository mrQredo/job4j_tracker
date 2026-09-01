package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);

            System.out.println();
            System.out.println("Обновление пары. Test");
            map.put("parsentev@yandex.ru", "Petr Arsentev");
            map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
            for (String key1 : map.keySet()) {
                String value1 = map.get(key);
                System.out.println(key1 + " = " + value1);
            }
        }
    }
}
