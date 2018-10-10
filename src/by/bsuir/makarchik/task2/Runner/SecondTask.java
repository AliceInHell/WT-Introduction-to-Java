package by.bsuir.makarchik.task2.Runner;

import by.bsuir.makarchik.ConsoleScanner.ConsoleScanner;
import by.bsuir.makarchik.task2.Localizer.Localizer;
import by.bsuir.makarchik.task2.Point.Point;

public class SecondTask {
    public static void main(String[] args){
        Point tmpPoint = new Point(ConsoleScanner.getDouble(), ConsoleScanner.getDouble());

        System.out.print(Localizer.locate(tmpPoint));
    }
}
