package by.bsuir.makarchik.Array;

public class Array {
    public static  void printIntArray(int[] array){
        for (int value : array){
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }

    public static  void printDoubleArray(double[] array){
        for (double value : array){
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }

    public static void printIntMatrix(int[][] matrix){
        for(int[] array : matrix){
            printIntArray(array);
        }
    }
}
