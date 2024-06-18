package Lecture_06Array.Array_ques.SubArrayQues;

public class MaxSubArrSum {

    public static void maxSumArr(int num[])
    {
        //int st = 0; int en = num.length-1;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<num.length; i++)
        {
            int st = i;
            for(int j=i; j<num.length; j++)
            {
                currSum = 0;
                int en = j;
                for(int k=st; k<=en; k++)
                {
                    currSum += num[k];
                }
                System.out.println(currSum);
                if( maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
           // System.out.println();

        }
        System.out.println("max sub array is: " + maxSum );

    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        maxSumArr(num);
    }
}
