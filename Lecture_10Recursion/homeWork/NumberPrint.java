package Lecture_10Recursion.homeWork;

public class NumberPrint {

    public static void occurrences(int n)
    {
        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        //base case
        if(n==0)
        {
            return;
        }
        //kam
        int lastDigit = n%10;
        occurrences(n/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        occurrences(1347);
    }
}
