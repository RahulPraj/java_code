package Lecture_02.Ques_02;
import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = scn.nextInt();
        
        System.out.println("Enter b :");
        int b = scn.nextInt();
        
        System.out.println("Enter c: ");
        int c = scn.nextInt();

        System.out.println("Enter operators:");
        char operator = scn.next().charAt(0); //convert into single character

        switch (operator) {
            case '+' : System.out.println(a+b+c);
                        break;
            case '-' : System.out.println(a-b-c);
                        break;
            case '*' : System.out.println(a*b*c);
                        break;
            case '/' : System.out.println(a/b/c);
                        break;
            default : System.out.println("something wrong");
        }
        
        
    }
    
}
