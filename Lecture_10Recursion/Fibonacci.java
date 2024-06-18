package Lecture_10Recursion;

public class Fibonacci {
    public static int fib(int n)
    {
        //basecase
        if(n == 0 || n == 1)
        {
            return 1;
        }
        int Fnm1 = fib(n-1);
        int Fnm2 = fib(n-2);
        int Fn = Fnm1 + Fnm2;
        return Fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(fib(n));
    }
}
