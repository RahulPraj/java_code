package Lecture_06Array.Array_ques.important ques;

public class rearrange {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0;
        int negIndex = 1;
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
        {
            if(nums[i] < 0)
            {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
            else
            {
                ans[posIndex] = nums[i];
                posIndex += 2;

            }
        }
        return ans;
    }
}
