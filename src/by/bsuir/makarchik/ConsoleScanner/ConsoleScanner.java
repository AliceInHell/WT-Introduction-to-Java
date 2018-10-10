package by.bsuir.makarchik.ConsoleScanner;

import java.util.Scanner;

public class ConsoleScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static double getDouble(){
        return scanner.nextDouble();
    }

    public static int getInt(){
        return scanner.nextInt();
    }

    public static int[] getIntArray(){
        int n = getInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++)
            array[i] = getInt();

        return array;
    }

    public static double[] getDoubleArray(){
        int n = getInt();
        double[] array = new double[n];

        for(int i = 0; i < n; i++)
            array[i] = getDouble();

        return array;
    }
}
