package Lecture_06Array.homework_Ques;

public class duplicate {

    public static void removeDuplicate(int[] nums)
    {
        int i = 0;
        for(int j = 1; j <= n; j++)
        {
            if(nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3}
    }
}
