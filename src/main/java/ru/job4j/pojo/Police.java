package ru.job4j.pojo;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(2020, 8, 30);

        System.out.println(license.getOwner() + " has a car - " + license.getModel()
                + " : " + license.getCode() + " from " + license.getCreated());
    }
}
