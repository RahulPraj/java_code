package Lecture_07_2DArray.HomeWork;

public class MatrixSearch {
    public static int keySearch(int matrix[][], int key)
    {
        int count7 = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    count7++;
                }
            }
        }
        return count7;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7},{7,8,9}};
        int key = 7;
        System.out.print(keySearch(matrix, key));
    }
}
