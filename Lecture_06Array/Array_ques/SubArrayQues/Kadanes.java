package Lecture_06Array.Array_ques.SubArrayQues;

public class Kadanes {

    public static void maxSubArrSum(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<num.length; i++)
        {
            cs = cs + num[i];
            if(cs < 0)
            {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum of subArr is:" + ms);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,3,-1,5,6,-1};
        maxSubArrSum(num);
    }
}
