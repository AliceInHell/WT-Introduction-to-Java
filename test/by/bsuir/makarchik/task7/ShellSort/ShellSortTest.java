package by.bsuir.makarchik.task7.ShellSort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void sortTest1() {
        double[] dataArray = {5, 4, 3, 2, 1};
        double[] expected = {1, 2, 3, 4, 5};

        assertTrue(Arrays.equals(expected,ShellSort.sort(dataArray)));
    }

    @Test
    void sortTest2() {
        double[] dataArray = {3.3, 5.5, 7.7, 10.1, 15.2};
        double[] expected = {3.3, 5.5, 7.7, 10.1, 15.2};

        assertTrue(Arrays.equals(expected,ShellSort.sort(dataArray)));
    }
}