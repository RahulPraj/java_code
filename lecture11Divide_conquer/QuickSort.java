package lecture11Divide_conquer;

public class QuickSort {

    public static void printArr(int arr[])
    {
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //step1 
    public static void quickSort(int arr[], int si, int ei)
    {
        //basecase
        if(si >= ei)
        {
            return;
        }

        //kam
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //left
        quickSort(arr, pIdx+1, ei);//right
    }

    public static int partition(int arr[], int si, int ei)
    {
        int pivot = arr[ei];
        int i = si-1; //make place for the element

        for(int j = si ; j < ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }

        i++;
                //swap
                int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;

                return i; //pivot ka index jo pIdx ke pas ja raha hai

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
