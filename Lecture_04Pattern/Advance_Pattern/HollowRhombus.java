package Lecture_04Pattern.Advance_Pattern;

public class HollowRhombus {

    public static void Hollow(int n)
    {
        for(int i=1; i <=n ;i++)
        {
            //space
            for(int j=1; j <= (n-i); j++)
            {
                System.out.print(" ");
            }
            //hollow reactangle
            for(int j = 1; j <= n; j++)
            {
                if( i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow(5);
    }
}
