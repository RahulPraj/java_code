package Lecture_06Array.Array_ques;

public class BinaryArr {

    public static int BinarySearch(int num[], int key)
    {
        int st = 0; int en = num.length-1;
        while(st <= en)    
        {
            int mid = (st + en) / 2;
            if(num[mid] == key)
            {
                return mid;
            }
            if(num[mid] < key)//right
            {
                st = mid + 1;
            }
            else{
                en = mid - 1;//left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 5, 6, 7, 8, 10, 12};
        int key = 1;
        System.out.println("we found the value : " + BinarySearch(num, key));
    }
}
