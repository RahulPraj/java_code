package Lecture_09BitManipulation;

public class EvenOdd {

    public static void evenOrOdd(int n)
    {
        int bitmask = 1;
        if((n & bitmask) == 0)
        {
            System.out.println("number is even");

        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(3);
        evenOrOdd(8);
    }
}
