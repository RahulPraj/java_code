package Lecture_06Array.Array_ques;

public class PairsArr {
    public static void pairs(int num[])
    {
        //outer loop
        int tp = 0;
        for(int i=0; i<num.length; i++)
        {
            int curr = num[i];// 2,4,6,8,10
            for(int j=i+1; j<num.length; j++)
            {
                System.out.print("(" + curr + "," + num[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are: " + tp);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        pairs(num);
    }
}
