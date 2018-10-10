package by.bsuir.makarchik.task6.FillMatrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FillMatrixTest {

    @Test
    void fillTest1() {
        int[] dataArray = {1, 2, 3, 4, 5};
        int[][] expectedMatrix = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 1}, {3, 4, 5, 1, 2}, {4, 5, 1, 2, 3}, {5, 1, 2, 3, 4}};

        assertTrue(Arrays.deepEquals(expectedMatrix, FillMatrix.fill(dataArray)));
    }

    @Test
    void fillTest2() {
        int[] dataArray = {1, 2};
        int[][] expectedMatrix = {{1, 2}, {2, 1}};

        assertTrue(Arrays.deepEquals(expectedMatrix, FillMatrix.fill(dataArray)));
    }
}