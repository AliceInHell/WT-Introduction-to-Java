package by.bsuir.makarchik.task7.Runner;

import by.bsuir.makarchik.Array.Array;
import by.bsuir.makarchik.ConsoleScanner.ConsoleScanner;
import by.bsuir.makarchik.task7.ShellSort.ShellSort;

public class SeventhTask {
    public static void main(String[] args){
        double[] array = ConsoleScanner.getDoubleArray();

        Array.printDoubleArray(ShellSort.sort(array));
    }
}
