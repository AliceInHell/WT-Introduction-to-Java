package by.bsuir.makarchik.task3.TableBuilder;

import by.bsuir.makarchik.task3.TgFunction.TgFunction;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TableBuilderTest {

    @Test
    void getMapResult1() {
        Map<Double, Double> actual = TableBuilder.getMapResult(1, 5, 2);
        double[] expected = {TgFunction.getValue(1), TgFunction.getValue(3), TgFunction.getValue(5)};

        boolean testResult = true;
        int index = 0;

        for(Map.Entry<Double, Double> item : actual.entrySet()){
            if(item.getValue() != expected[index])
                testResult = false;
            index++;
        }

        assertTrue(testResult);
    }

    @Test
    void getMapResult2() {
        Map<Double, Double> actual = TableBuilder.getMapResult(1.5, 3.2, 0.7);
        double[] expected = {TgFunction.getValue(1.5), TgFunction.getValue(2.2), TgFunction.getValue(2.9)};

        boolean testResult = true;
        int index = 0;

        for(Map.Entry<Double, Double> item : actual.entrySet()){
            if(item.getValue() != expected[index])
                testResult = false;
            index++;
        }

        assertTrue(testResult);
    }
}