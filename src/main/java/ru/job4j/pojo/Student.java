package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String nameStudent;
    private String group;
    private LocalDate enrolled;

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(int year, int month, int dayOfMonth) {
        this.enrolled = LocalDate.of(year, month, dayOfMonth);
    }
}
