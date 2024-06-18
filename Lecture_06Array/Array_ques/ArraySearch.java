package Lecture_06Array.Array_ques;

public class ArraySearch {
    
    public static int LinearSearch(int num[], int key){
        {
            for(int i=0; i<num.length; i++)
            {
                if(num[i] == key)
                {
                    return i;
                }
            }
            return -1;
        }

    }
    public static void main(String[] args) {
        int num[] = {2,5,6,8,10,12,14,15};
        int key = 10;

        int ans = LinearSearch(num, key);
        if(ans == -1)
        {
            System.out.print("the index of not found num");
        }
        else{
            System.out.println("Num  found :" + ans);
        }
    }
}
