package PracticeQues;

public class Basics {

    public static void printSubArr(int[] arr)
    {
        //l1
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                sum = 0;
                for(int k = i; k <= j; k++)
                {
                    System.out.print("(" + arr[k] + ")");
                     sum = sum + arr[k];
                }
                System.out.println();
                System.out.println(sum);
               
            }
            System.out.println();
             
        }
    }

    public static void kadanes(int[] arr)
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < arr.length; i++)
        {
            cs = cs + arr[i];
            if(cs < 0)
            {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }
        System.out.print(ms);
    }
    public static void main(String args[])
    {
        int[] arr = {2,4,6,8,10};
        // printSubArr(arr);
        kadanes(arr);
    }
}
