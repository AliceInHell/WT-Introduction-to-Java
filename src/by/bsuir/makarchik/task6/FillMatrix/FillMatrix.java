package by.bsuir.makarchik.task6.FillMatrix;

public class FillMatrix {
    public static int[][] fill(int[] dataArray){
        int offset = 0;
        int[][] matrix = new int[dataArray.length][dataArray.length];

        for(int i = 0; i < dataArray.length; i++){
            for(int j = 0; j < dataArray.length; j++){
                matrix[i][j] = dataArray[ (j + offset) % dataArray.length];
            }
            offset++;
        }

        return matrix;
    }
}
