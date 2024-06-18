package Lecture_06Sorting;

public class InsertionSort {
    public static void sorting(int arr[])
    {
        // //sorting in ascending order
        // for(int i = 1; i<arr.length; i++)
        // {
        //     int temp = arr[i];
        //     int prev = i-1;
        //     while(prev >= 0 && arr[prev] > temp)
        //     {
        //         arr[prev + 1] = arr[prev];
        //         prev--;
        //     }
        //     //insert
        //     arr[prev+1] = temp;

        // }

        //sorting in decending order
        //sorting in ascending order
        for(int i = 1; i<arr.length; i++)
        {
            int temp = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < temp)
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insert
            arr[prev+1] = temp;

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
