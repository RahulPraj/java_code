package Lecture_06Sorting;

public class BubbleSort {
    public static void sorting(int arr[]){
        for(int turn = 0; turn < arr.length; turn++)
        {
            //int swap = 0;
            for(int j = 0; j < arr.length - 1- turn; j++)
            {
                //sorting in ascending order
                // if(arr[j]>arr[j+1]){
                //     //swap
                // int temp = arr[j];
                // arr[j] = arr[j+1];
                // arr[j+1] = temp;
                // }
                //sorting in decending order
                if(arr[j]<arr[j+1]){
                    //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
                

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
        int arr[] = {4,5,3,2,1};
        sorting(arr);
        printarr(arr);

    }
}
