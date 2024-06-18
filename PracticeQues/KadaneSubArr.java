package PracticeQues;

public class KadaneSubArr {
    public static void subArrSum(int arr[])
    {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i++)
        {
            cs += arr[i];
            if(cs < 0)
            {
                cs = 0;
            }
            ms = Math.max(ms, cs);

        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArrSum(arr);
    }
}
