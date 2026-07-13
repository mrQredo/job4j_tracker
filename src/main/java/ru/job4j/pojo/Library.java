package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book life = new Book("Life code", 100);
        Book dead = new Book("Dead code", 50);
        Book dirty = new Book("Dirty code", 70);
        Book clean = new Book("Clean code", 1000);
        Book[] books = new Book[4];
        books[0] = life;
        books[1] = dead;
        books[2] = dirty;
        books[3] = clean;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("Change the life code to a clean code.");
        books[0] = clean;
        books[3] = life;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("hown only book.name = Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
