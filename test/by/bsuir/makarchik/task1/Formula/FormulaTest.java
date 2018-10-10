package by.bsuir.makarchik.task1.Formula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormulaTest {

    @Test
    void calculateTest1() {
        assertEquals(4.331524930392148, Formula.calculate(4, 4));
    }

    @Test
    void calculateTest2() {
        assertEquals(1.913410905215903, Formula.calculate(1, 1));
    }
}