package by.bsuir.makarchik.task4.Runner;

import by.bsuir.makarchik.ConsoleScanner.ConsoleScanner;
import by.bsuir.makarchik.task4.PrimeNumber.PrimeNumber;

public class FourthTask {
    public static void main(String[] args){
        int[] array = ConsoleScanner.getIntArray();

        for(int i = 0; i < array.length; i++)
            if(PrimeNumber.isPrime(array[i]))
                System.out.print((i + 1) + " ");
    }
}
