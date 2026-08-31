package ru.job4j.queue;

import java.util.Deque;
import java.util.LinkedList;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int size = evenElements.size();

        for (int i = 0; i < size; i++) {
            char ch = evenElements.poll();        // достаём первый элемент и удаляем
            if (i % 2 == 0) {                     // берём только чётные позиции (0, 2, 4...)
                result.append(ch);
            }
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();

        while (descendingElements.peekLast() != null) {  // проверяем, есть ли элемент с конца
            result.append(descendingElements.pollLast()); // достаём и удаляем последний
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
