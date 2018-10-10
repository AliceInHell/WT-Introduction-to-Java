package by.bsuir.makarchik.task4.PrimeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void isPrimeTest1() {
        assertTrue(PrimeNumber.isPrime(5));
    }

    @Test
    void isPrimeTest2() {
        assertFalse(PrimeNumber.isPrime(8));
    }
}