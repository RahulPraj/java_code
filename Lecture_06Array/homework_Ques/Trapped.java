package Lecture_06Array.homework_Ques;

public class Trapped {
    public static int trappedWater(int hi[])
    {
        int n = hi.length;
        //leftmax boundary
        int leftMax[] = new int[n];
        leftMax[0] = hi[0];
        for(int i = 1; i < n; i++)
        {
            leftMax[i] = Math.max(hi[i],leftMax[i-1]);
        }
        //righmax boundary
        int righmax[] = new int[n];
        righmax[n-1] = hi[n-1];
        for(int i = n-2; i >= 0; i--)
        {
            righmax[i] = Math.max(hi[i], righmax[i+1]);
        }
        //loop
        int trapped = 0;
        for(int i = 0; i<n; i++)
        {
            int waterLevel = Math.min(leftMax[i], righmax[i]);
            trapped += (waterLevel - hi[i]); 
        }
        return trapped;

    }
    public static void main(String[] args) {
        int hi[] = {0,1,0,2,1,0,1,3,2,1};
        System.out.println(trappedWater(hi));
    }
}
