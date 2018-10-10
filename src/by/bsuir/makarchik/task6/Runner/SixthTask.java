package by.bsuir.makarchik.task6.Runner;

import by.bsuir.makarchik.Array.Array;
import by.bsuir.makarchik.ConsoleScanner.ConsoleScanner;
import by.bsuir.makarchik.task6.FillMatrix.FillMatrix;

public class SixthTask {
    public static  void main(String[] args){
        int[] dataArray = ConsoleScanner.getIntArray();

        Array.printIntMatrix(FillMatrix.fill(dataArray));
    }
}
