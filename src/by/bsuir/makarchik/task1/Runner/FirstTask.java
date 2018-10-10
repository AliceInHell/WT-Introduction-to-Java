package by.bsuir.makarchik.task1.Runner;

import by.bsuir.makarchik.ConsoleScanner.ConsoleScanner;
import by.bsuir.makarchik.task1.Formula.Formula;

public class FirstTask {
    public static void main(String[] args){
        System.out.print(Formula.calculate(ConsoleScanner.getDouble(), ConsoleScanner.getDouble()));
    }
}
