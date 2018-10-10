package by.bsuir.makarchik.task16.BooTitleComparator;

import by.bsuir.makarchik.task12.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    public int compare(Book a, Book b){
        return a.getTitle().compareTo(b.getTitle());
    }
}
