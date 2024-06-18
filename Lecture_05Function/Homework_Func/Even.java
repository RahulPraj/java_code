package Lecture_05Function.Homework_Func;

public class Even {

    public static boolean isEven(int n)
    {
        boolean isEven = true;
        if(n%2 != 0)
        {
            return false;
        }
        return isEven;
    }
    public static void main(String[] args) {
        System.out.print(isEven(4));
    }
}
