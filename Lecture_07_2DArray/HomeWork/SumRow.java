package Lecture_07_2DArray.HomeWork;

public class SumRow {
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7},{7,8,9}};
        int sum = 0;
        for(int j = 0; j < matrix[0].length; j++)
        {
            sum += matrix[1][j];
        }
        System.out.print("sum of row:"+ sum);
    }
}
