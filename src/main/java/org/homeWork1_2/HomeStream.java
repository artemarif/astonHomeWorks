package org.homeWork1_2;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;


public class HomeStream {
    public static void main(String[] args) {
        Student max = new Student("Max", 26, List.of(
                new Book("Игра Кота", 226, 2017),
                new Book("Кровь легиона", 277, 2024),
                new Book("Меняя маски", 213, 2018),
                new Book("Хризалида", 246, 2019),
                new Book("Преступление и Наказание", 672, 1866)));
        Student vasya = new Student("Vasya", 18, List.of(
                new Book("Игра Кота", 226, 2017),
                new Book("Кровь легиона", 277, 2024),
                new Book("Меняя маски", 213, 2018),
                new Book("Хризалида", 246, 2019),
                new Book("Преступление и Наказание", 672, 1866)));
        Student oleg = new Student("Oleg", 32, List.of(
                new Book("Игра Кота", 226, 2017),
                new Book("Кровь легиона", 277, 2024),
                new Book("Меняя маски", 213, 2018),
                new Book("Хризалида", 246, 2019),
                new Book("Преступление и Наказание", 672, 1866)));
        Student eduard = new Student("Eduard", 18, List.of(
                new Book("Игра Кота", 226, 2017),
                new Book("Кровь легиона", 277, 2024),
                new Book("Меняя маски", 213, 2018),
                new Book("Хризалида", 246, 2019),
                new Book("Преступление и Наказание", 672, 1866)));
        Student igor = new Student("Igor", 7, List.of(
                new Book("Игра Кота", 226, 2017),
                new Book("Кровь легиона", 277, 2024),
                new Book("Меняя маски", 213, 2018),
                new Book("Хризалида", 246, 2019),
                new Book("Преступление и Наказание", 672, 1866)));
        List<Student> students = new ArrayList<>();
        students.add(max);
        students.add(vasya);
        students.add(oleg);
        students.add(eduard);
        students.add(igor);
        students.stream().peek(System.out::println)
                .flatMap(student -> student.getBooks().stream()).distinct()
                .sorted(Comparator.comparingInt(Book::getNumOfPages))
                .filter(book -> book.releaseDate > 2000)
                .limit(3).map(Book::getReleaseDate)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Такая книга отсутствует"));
    }
}