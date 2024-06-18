package Lecture_06Array.Array_ques.SubArrayQues;

public class PrefixSubArrSum {
    
    public static void prefixMaxSum(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        //calcu prefix array
        for(int i = 1; i <prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + num[i];
        }
        for(int i=0; i<num.length; i++)
        {
            int st = i;
            currSum = 0;
            for(int j=i; j<num.length; j++)
            {
                int en = j;
                currSum = st == 0 ? prefix[en] : prefix[en] - prefix[st-1];
                System.out.println(currSum);
                if(maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum of subarr: " + maxSum);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        prefixMaxSum(num);
    }
}
