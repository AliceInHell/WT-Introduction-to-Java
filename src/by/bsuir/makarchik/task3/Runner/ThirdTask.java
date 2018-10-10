package by.bsuir.makarchik.task3.Runner;

import by.bsuir.makarchik.ConsoleScanner.ConsoleScanner;
import by.bsuir.makarchik.task3.TableBuilder.TableBuilder;

import java.util.Map;
import java.util.zip.DeflaterOutputStream;

public class ThirdTask {
    public static void main(String[] args) {
        double a = ConsoleScanner.getDouble();
        double b = ConsoleScanner.getDouble();
        double h = ConsoleScanner.getDouble();

        Map<Double, Double> resultMap = TableBuilder.getMapResult(a, b, h);
        for(Map.Entry<Double, Double> item: resultMap.entrySet())
            System.out.println("Tg(" + item.getKey() + ") = " + item.getValue());
    }
}
