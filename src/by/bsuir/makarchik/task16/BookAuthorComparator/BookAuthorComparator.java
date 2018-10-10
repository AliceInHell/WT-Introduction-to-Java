package by.bsuir.makarchik.task16.BookAuthorComparator;

import by.bsuir.makarchik.task12.Book;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {
    public int compare(Book a, Book b){
        return a.getAuthor().compareTo(b.getAuthor());
    }
}
