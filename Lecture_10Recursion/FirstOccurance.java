package Lecture_10Recursion;

public class FirstOccurance {

    public static int firstOcc(int arr[], int key, int i)
    {
        if(i == arr.length){
            return -1;
        }
        
        if(arr[i] == key)
        {
            return i;
        }

        return firstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,5,7,8};
        System.out.println(firstOcc(arr, 5, 0));

    }
}
