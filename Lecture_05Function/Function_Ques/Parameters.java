package Lecture_05Function.Function_Ques;
import java.util.*;

public class Parameters {

    public static int calculatorSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt() ;
      int b = scn.nextInt();
      int sum = calculatorSum(a,b); 
      System.out.print(sum);
    }
}
