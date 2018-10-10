package by.bsuir.makarchik.task3.TableBuilder;

import by.bsuir.makarchik.task3.TgFunction.TgFunction;

import java.util.HashMap;
import java.util.Map;

public class TableBuilder {
    public static Map<Double, Double> getMapResult(double a, double b, double h){
        Map<Double, Double> resultMap = new HashMap<Double, Double>();
        for (double i = a; i + h <= b; i += h) {
            resultMap.put(i, TgFunction.getValue(i));
        }

        return resultMap;
    }
}
