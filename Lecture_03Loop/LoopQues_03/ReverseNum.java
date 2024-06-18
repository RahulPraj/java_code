import java.util.*;
public class ReverseNum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter num: ");
        int num = sc.nextInt();


        while(num > 0){
            int lastDig = num % 10;
            System.out.print( lastDig );
            num = num / 10;
        }
        System.out.println();
    }
}