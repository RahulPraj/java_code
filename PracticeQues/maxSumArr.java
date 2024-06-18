package PracticeQues;

public class maxSumArr {

    public static void maxSum(int arr[])
    {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            int st = i;
            for(int j = i; j<arr.length; j++)
            {
                int ed = j;
                currSum = 0;
                for(int k = st; k <= ed; k++)
                {
                    currSum += arr[k];
                }
                System.err.println(currSum);
                if(max < currSum)
                {
                    max = currSum;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxSum(arr);
    }
}
