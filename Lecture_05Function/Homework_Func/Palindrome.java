package Lecture_05Function.Homework_Func;

import java.util.*;

public class Palindrome {
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            int rem = n % 10;
            rev = (rev*10) + rem;
            n /= 10; 
        }
        
        return rev;
    }

    public static boolean isPalindrome(int n){
        int rev1 = reverse(n);
        if(n != rev1)
        {
            return false;
        }
         return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n = ");
        int n = sc.nextInt();
        int r = reverse(n);
        System.out.println("the value of reverse num = " + r);
       if(isPalindrome(n)) {
        System.out.println("number " + n + " is a Palindrome");
       }
       else{
        System.out.println("number " + n + " is not a Palindrome ");
       }
    }
}
