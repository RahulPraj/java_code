package Lecture_05Function.Function_Ques;

public class DecimalBinary {

    public static void decBin(int n)
    {
        int pow = 0;
        int DecNum = n;
        int bin = 0;
        while(n > 0)
        {
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.print("convert Decimal " + DecNum + " to binary = " + bin);
    }
    public static void main(String[] args) {
        decBin(7);
    }
}
