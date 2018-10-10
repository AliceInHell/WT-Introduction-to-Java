package by.bsuir.makarchik.task16.BookPriceComparator;

import by.bsuir.makarchik.task12.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    public int compare(Book a, Book b){
        return a.getPrice() - b.getPrice();
    }
}
