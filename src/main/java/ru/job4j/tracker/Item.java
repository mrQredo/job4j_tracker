package ru.job4j.tracker;

import java.time.LocalDateTime;

//Класс Item описывает модель заявки (Модель данных)
public class Item {
    private int id; //это уникальный номер заявки
    private String name; //содержит название заявки
    private LocalDateTime created = LocalDateTime.now(); //содержит дату создания заявки

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}