package by.bsuir.makarchik.task5.Runner;

import by.bsuir.makarchik.ConsoleScanner.ConsoleScanner;
import by.bsuir.makarchik.task5.Sequence.Sequence;

public class FifthTask {
    public static void main(String[] args){
        int[] array = ConsoleScanner.getIntArray();
        int[] maxSequences = new int[array.length];

        int maxLength = Sequence.getMaxSequenceLength(array);

        System.out.print(array.length - maxLength);
    }
}
