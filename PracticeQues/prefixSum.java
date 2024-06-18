package PracticeQues;

public class prefixSum {
    public static void subArrSum(int arr[])
    {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++)
        {
            int st = i;
            for(int j = i; j < arr.length ; j++)
            {
                int ed = j;
                currSum = st == 0 ? prefix[ed] : prefix[ed] - prefix[st-1];
                if(maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArrSum(arr);
    }
}
