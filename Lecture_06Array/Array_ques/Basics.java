package Lecture_06Array.Array_ques;

public class Basics {
    
    // array as argument work on call by refrence
    public static void update(int marks[], int notchangeble)
    {
        for(int i = 0; i<marks.length; i++)
        {
             notchangeble = 15;//it works on call by value
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int notchangeble = 10;
        update(marks, notchangeble);

        System.out.println(notchangeble);
        //print the marks
        for(int i=0; i<marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
