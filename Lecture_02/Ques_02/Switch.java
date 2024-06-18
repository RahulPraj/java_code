package Lecture_02.Ques_02;
import java.util.*;
public class Switch {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     //int num = 2;
      switch (num){
        case 1: System.out.println("burger");
                break;
        case 2: System.out.println("fries");
                break;
        default : System.out.println("lol");
      }  
        
    }
}
