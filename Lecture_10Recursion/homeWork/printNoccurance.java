package Lecture_10Recursion.homeWork;

public class printNoccurance {
    
    public static void occurrence(int[] arr, int i, int key)
    {
        //base case
        if(i==0)
        {
            return;
        }
        if(arr[i] == key)
        {
            System.out.println(i+"");
        }
        occurrence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,2,5,2,6,2};
        int key = 0;
        occurrence(arr, 0, key);
    }
}
