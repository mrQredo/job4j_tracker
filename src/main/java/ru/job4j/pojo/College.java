package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameStudent("Gennadiy Vedernikov");
        student.setGroup("Java 2026");
        student.setEnrolled(2026, 06, 01);

        System.out.println(student.getNameStudent() + " обучается в группе: " + student.getGroup() + ", c " + student.getEnrolled() + ".");

    }
}
