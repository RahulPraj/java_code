package HomeWork;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = 0;//\\
       int even = 0; 
       int odd = 0;
       
       for(int i = 1; i <= n; i++)
       {
        if(i%2==0)
        {
            even = even + i;
            System.out.println(" even :" + i);
        }
        else
        {
            odd += i;
            System.out.println(" odd :" + i);
        }
       }
       sum = even+odd;
       System.out.println("total sum :" +sum);
    }
}
