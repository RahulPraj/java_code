package PracticeQues;

public class TrappedWater {
    public static int trapped(int height[]){
        int n = height.length;

        //leftmax boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++)
        {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //rightmax boundary
        int rightmax[] = new int[n];
         rightmax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--)
        {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        //loop run
        int trappedWater = 0;
        for(int i = 0; i < n; i++)
        {
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.print(trapped(height));
    }
}
