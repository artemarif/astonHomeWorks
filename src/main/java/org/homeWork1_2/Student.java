package org.homeWork1_2;

import java.util.Arrays;
import java.util.List;

public class Student {
    String name;
    int age;

    List<Book> books;

    public Student(String name, int age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                "}\n";
    }
}
