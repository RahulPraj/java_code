package Lecture_06Sorting;

public class CountingSort {
    public static void sorting(int arr[])
    {
        //finding range
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        //finding frequency using orignal arr
        int count[] = new int[largest + 1];
        for(int i = 0; i <arr.length; i++)
        {
            count[arr[i]]++;
        }
        //sorting using count arr in ascending order
        // int j = 0;//for the index

        // for(int i = 0; i < count.length; i++)
        // {
        //     while(count[i] > 0)
        //     {
        //         arr[j] = i;
        //         j++;
        //         count[i]--;
        //     }
        // }

        //sorting in decending order
        int j = 0;//for the index

        for(int i = count.length-1; i >= 0; i--)
        {
            while(count[i] > 0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,3,4,7};
        sorting(arr);
        printarr(arr);

    }
}
