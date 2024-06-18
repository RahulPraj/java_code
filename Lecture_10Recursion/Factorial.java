package Lecture_10Recursion;

public class Factorial {
    public static int fact(int n)
    {
        //basecase
        if(n==0)
        {
            return 1;
        }
        int Fnm1 = fact(n-1);
        int Fn = n * Fnm1;
        return Fn; 
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(fact(n));
    }
}
