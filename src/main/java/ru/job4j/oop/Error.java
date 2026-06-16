package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public void printInfo() {
        System.out.println("Активный: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error hardware = new Error(true, 1, "Неисправности физических компонентов системы!");
        hardware.printInfo();
        Error software = new Error(true, 2, "Нарушения в работе программного обеспечения!");
        software.printInfo();
        Error drivers = new Error();
        drivers.printInfo();
    }
}