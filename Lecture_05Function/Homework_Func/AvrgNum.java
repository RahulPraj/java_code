package Lecture_05Function.Homework_Func;
import java.util.*;

public class AvrgNum {

    public static int avgNum(int n1, int n2, int n3)
    {
        int avg = (n1 + n2 + n3) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num a : ");
        int a = sc.nextInt();
        
        System.out.print("Enter num b : ");
        int b = sc.nextInt();

        System.out.print("Enter num c : ");
        int c = sc.nextInt();

        int ans = avgNum(a, b, c);
        System.out.println("Enter the avg of three num :" +ans);
        
    }
}
