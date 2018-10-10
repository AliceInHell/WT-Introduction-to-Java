package by.bsuir.makarchik.task12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book[] _bookList;

    @BeforeEach
    void setUpBookTest(){
        _bookList = new Book[5];
        _bookList[0] = new Book("Alice In WonderLand", "L. Karrol", 30, 2, 2012);
        _bookList[1] = new Book("Sea Wolf", "J. London", 20, 3, 2012);
        _bookList[2] = new Book("Maya Code", "A. Scott", 45, 1, 2012);
        _bookList[3] = new Book("Red Pill", "A. Kurpatov", 15, 6, 2012);
        _bookList[4] = new Book("CLR via C#", "J. Rihter", 50, 4, 2012);
    }

    @Test
    void IComparableTest(){
        Arrays.sort(_bookList);

        Book[] expected = new Book[5];
        expected[1] = new Book("Alice In WonderLand", "L. Karrol", 30, 2, 2012);
        expected[2] = new Book("Sea Wolf", "J. London", 20, 3, 2012);
        expected[0] = new Book("Maya Code", "A. Scott", 45, 1, 2012);
        expected[4] = new Book("Red Pill", "A. Kurpatov", 15, 6, 2012);
        expected[3] = new Book("CLR via C#", "J. Rihter", 50, 4, 2012);

        assertTrue(Arrays.equals(expected, _bookList));
    }
}