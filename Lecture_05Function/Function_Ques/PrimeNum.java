package Lecture_05Function.Function_Ques;

public class PrimeNum {

    public static boolean isPrime(int n)
    {
        //Special case
        if(n == 2)
        {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n);i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void PrimeRange(int n)
    {
        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimeRange(10);
    }
}
