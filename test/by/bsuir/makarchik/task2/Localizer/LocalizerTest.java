package by.bsuir.makarchik.task2.Localizer;

import by.bsuir.makarchik.task2.Point.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalizerTest {

    @Test
    void locateTest1() {
        assertTrue(Localizer.locate(new Point(0, 0)));
    }

    @Test
    void locateTest2() {
        assertFalse(Localizer.locate(new Point(6, 6)));
    }
}