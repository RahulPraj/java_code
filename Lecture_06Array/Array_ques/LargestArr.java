package Lecture_06Array.Array_ques;

public class LargestArr {

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length;i++)
        {
            if(num[i] > largest)
            {
                largest = num[i];
            }

            if(num[i] < smallest)
            {
                smallest = num[i];
            }
        }
        System.out.println("the smallest value is: " + smallest);
        return largest;
    }
    
    public static void main(String[] args) {
        int num[] = {1,4,5,8,3,9};
        System.out.print("largest value is: " + getLargest(num));
    }
}
