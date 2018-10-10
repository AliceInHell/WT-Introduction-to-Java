package by.bsuir.makarchik.task5.Sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {

    @Test
    void getMaxSequenceLengthTest1() {
        int[] array = {3, 6, 7, 2, 3, 7, 9};

        //must delete 3 elements
        assertEquals(array.length - 3, Sequence.getMaxSequenceLength(array));
    }

    @Test
    void getMaxSequenceLengthTest2() {
        int[] array = {8, 6, 4, 3, 2, 1};

        //must delete 5 elements
        assertEquals(array.length - 5, Sequence.getMaxSequenceLength(array));
    }
}