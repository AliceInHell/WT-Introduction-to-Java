package by.bsuir.makarchik.task8.SequenceMerger;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SequenceMergerTest {

    @Test
    void merge1() {
        double[] a = {1, 3, 6, 7};
        double[] b = {1, 2, 5, 7, 8};

        double[] actual = SequenceMerger.merge(a, b);
        double[] expected = {1, 2, 3, 5, 6, 7, 8};

        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    void merge2() {
        double[] a = {0, 2, 4, 7};
        double[] b = {0, 2, 4, 7};

        double[] actual = SequenceMerger.merge(a, b);
        double[] expected = {0, 2, 4, 7};

        assertTrue(Arrays.equals(expected, actual));
    }
}