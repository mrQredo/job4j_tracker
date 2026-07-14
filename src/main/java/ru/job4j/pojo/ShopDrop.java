package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        // Сдвигаем элементы влево, начиная с указанного индекса
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        // Обнуляю последний элемент
        products[products.length - 1] = null;
        return products;
    }
}