package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    // метод getLastHappyCustomer() должен вернуть
    // имя последнего счастливого обладателя желаемого товара
    public String getLastHappyCustomer() {
        // создал список ограниченный количеством доступного к покупке товара
        Queue<Customer> happyCustomers = new ArrayBlockingQueue<>(count);
        for (Customer customer : queue) {
            happyCustomers.offer(customer); // если хватает товара закидываем в список
        }
        while (happyCustomers.size() > 1) {
            happyCustomers.poll();          // убираем всех, кроме последнего
        }
        return happyCustomers.peek() != null ? happyCustomers.peek().name() : null; // возврат имени последнего купившего товар
    }

    // метод getFirstUpsetCustomer() должен вернуть
    // имя первого клиента, которому сегодня не повезло и ему не хватило товара
    public String getFirstUpsetCustomer() {
        Queue<Customer> happyCustomers = new ArrayBlockingQueue<>(count);
        for (Customer customer : queue) {
           happyCustomers.offer(customer); // если хватает товара закидываем в список
        }
        queue.removeAll(happyCustomers);
        return queue.peek() != null ? queue.peek().name() : null;
    }
}
