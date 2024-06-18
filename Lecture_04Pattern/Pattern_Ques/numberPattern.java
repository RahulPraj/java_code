package Lecture_04Pattern.Pattern_Ques;

public class numberPattern {
    public static void num(int n) {
        for(int i = 1; i<=n; i++)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        num(5);
    }
}
