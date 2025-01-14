package Lecture_06Array.Array_ques;

//import javax.swing.UIDefaults.ProxyLazyValue;

public class TrappedWater {
    public static int trapped(int height[]) 
    {
        int n = height.length;
     //calculate leftMax boundary - array 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate rightMax boundary- array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i = 0; i < n; i++)
        {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.print(trapped(height));
    }
}
