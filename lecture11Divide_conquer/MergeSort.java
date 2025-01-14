public class MergeSort{
    public static void printArr(int arr[])
    {
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //step1 and 2
    public static void mergeSort(int arr[], int si, int ei){
        //basecase
        if(si >= ei)
        {
            return;
        }
        
        //kaam

        int mid = si + (ei-si)/2;

        mergeSort(arr, si, mid); //left
        mergeSort(arr, mid+1, ei); //right

        merge(arr, si , mid, ei);
    }


    //step3

    public static void merge(int arr[], int si, int mid, int ei){

        int temp[] = new int[ei-si+1];// temp array
        int i = si; //iterate for left
        int j = mid+1;//iterate for right
        int k = 0;

        while(i <= mid && j <= ei)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {   
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        //left 
        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }

        //right
        while(j <= ei)
        {
            temp[k++] = arr[j++];
        }

        //copy temp in orignal array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
       mergeSort(arr, 0, arr.length-1);
       printArr(arr);
    }
}