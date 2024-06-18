package Lecture_06Sorting;

public class SelectionSort {
    public static void sorting(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            int minPos = i;
            //sorting in ascending order
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[minPos] > arr[j])
                {
                    minPos = j;
                }
            }

            //sorting in decending order
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[minPos] < arr[j])
                {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

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
        int arr[] = {4,5,3,2,1};
        sorting(arr);
        printarr(arr);

    }
}
