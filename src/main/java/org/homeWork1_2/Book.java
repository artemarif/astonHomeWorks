package org.homeWork1_2;

public class Book {
    String name;
    int numOfPages;
    int releaseDate;

    public Book(String name, int numOfPages, int releaseDate) {
        this.name = name;
        this.numOfPages = numOfPages;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return numOfPages == book.numOfPages && releaseDate == book.releaseDate && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + numOfPages;
        result = 31 * result + releaseDate;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numOfPages=" + numOfPages +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
