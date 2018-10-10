package by.bsuir.makarchik.task8.Runner;

import by.bsuir.makarchik.Array.Array;
import by.bsuir.makarchik.ConsoleScanner.ConsoleScanner;
import by.bsuir.makarchik.task8.SequenceMerger.SequenceMerger;

public class EighthTask {
    public static void main(String[] args){
        double[] firstSequence = ConsoleScanner.getDoubleArray();
        double[] secondSequence = ConsoleScanner.getDoubleArray();

        Array.printDoubleArray(SequenceMerger.merge(firstSequence, secondSequence));
    }
}
