package Lecture_07_2DArray.HomeWork;

public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8,6},{8,8,7,2},{7,8,9,5}};

        int row = 3, col = 4;
        //display orignal matrix
        printMatrix(matrix);

        //trasnpose
        int trasnpose[][] = new int[col][row];
        for(int i = 0; i <row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                trasnpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(trasnpose);

    }

    public static void printMatrix(int matrix[][])
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
