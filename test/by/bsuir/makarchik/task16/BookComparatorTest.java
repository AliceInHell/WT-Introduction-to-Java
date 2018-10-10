package by.bsuir.makarchik.task16;

import by.bsuir.makarchik.task12.Book;
import by.bsuir.makarchik.task16.BooTitleComparator.BookTitleComparator;
import by.bsuir.makarchik.task16.BookAuthorComparator.BookAuthorComparator;
import by.bsuir.makarchik.task16.BookPriceComparator.BookPriceComparator;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BookComparatorTest {
    private TreeSet<Book> _bookTreeSet;
    private BookAuthorComparator _bookAuthorComapator = new BookAuthorComparator();
    private BookPriceComparator _bookPriceComapator = new BookPriceComparator();
    private BookTitleComparator _bookTitleComapator = new BookTitleComparator();

    private void addBooks(TreeSet<Book> treeSet){
       treeSet.add(new Book("Alice In WonderLand", "L. Karrol", 30, 2, 2012));
       treeSet.add(new Book("Sea Wolf", "J. London", 20, 3, 2012));
       treeSet.add(new Book("Maya Code", "A. Scott", 45, 1, 2012));
       treeSet.add(new Book("Red Pill", "A. Kurpatov", 15, 6, 2012));
       treeSet.add(new Book("CLR via C#", "J. Rihter", 50, 4, 2012));
       treeSet.add(new Book("Border Moonlight", "A. Scott", 30, 9, 2012));
    }

    @Test
    void sortByTitleTest(){
        _bookTreeSet = new TreeSet<Book>(_bookTitleComapator);
        addBooks(_bookTreeSet);

        boolean actual = true;

        Object[] arraySet = _bookTreeSet.toArray();
        for(int i = 0; i < arraySet.length - 1; i++){
            if( ((Book)arraySet[i]).getTitle().compareTo(((Book)arraySet[i + 1]).getTitle()) > 0)
                actual = false;
        }

        assertTrue(actual);
    }

    @Test
    void sortByTitleAndAuthor(){
        _bookTreeSet = new TreeSet<Book>(_bookTitleComapator.thenComparing(_bookAuthorComapator));
        addBooks(_bookTreeSet);

        boolean actual = true;

        Object[] arraySet = _bookTreeSet.toArray();
        for(int i = 0; i < arraySet.length - 1; i++){
            if( ((Book)arraySet[i]).getTitle().compareTo(((Book)arraySet[i + 1]).getTitle()) == 0
            && ((Book)arraySet[i]).getAuthor().compareTo(((Book)arraySet[i + 1]).getAuthor()) > 0)
                actual = false;
        }

        assertTrue(actual);
    }

    @Test
    void sortByAuthorAndTitle(){
        _bookTreeSet = new TreeSet<Book>(_bookAuthorComapator.thenComparing(_bookTitleComapator));
        addBooks(_bookTreeSet);

        boolean actual = true;

        Object[] arraySet = _bookTreeSet.toArray();
        for(int i = 0; i < arraySet.length - 1; i++){
            if( ((Book)arraySet[i]).getAuthor().compareTo(((Book)arraySet[i + 1]).getAuthor()) == 0
                    && ((Book)arraySet[i]).getTitle().compareTo(((Book)arraySet[i + 1]).getTitle()) > 0)
                actual = false;
        }

        assertTrue(actual);
    }

    @Test
    void sortByAuthorTitleAndPrice(){
        _bookTreeSet = new TreeSet<Book>(_bookAuthorComapator.thenComparing(_bookTitleComapator).thenComparing(_bookPriceComapator));
        addBooks(_bookTreeSet);

        boolean actual = true;

        Object[] arraySet = _bookTreeSet.toArray();
        for(int i = 0; i < arraySet.length - 1; i++){
            if( ((Book)arraySet[i]).getAuthor().compareTo(((Book)arraySet[i + 1]).getAuthor()) == 0
                    && ((Book)arraySet[i]).getTitle().compareTo(((Book)arraySet[i + 1]).getTitle()) == 0
                        && ((Book)arraySet[i]).getPrice() - (((Book)arraySet[i + 1]).getPrice()) > 0)
                actual = false;
        }

        assertTrue(actual);
    }
}