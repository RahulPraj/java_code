package Lecture_06Array.homework_Ques;

public class RepeatNum {
    public static boolean repeat(int nums[])
    {
        
        for(int i = 0; i <nums.length; i++)
        {
            for(int j = i+1; j < nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
                

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(repeat(nums));
    }
}
