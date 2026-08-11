package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
                return result;
            }
        }
        throw new ElementNotFoundException("Element not found in the array.");
    }

    public static void main(String[] args) {
        String[] value = {"Gena", "Petya", "Stas"};
        try {
            indexOf(value, "Olga");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}