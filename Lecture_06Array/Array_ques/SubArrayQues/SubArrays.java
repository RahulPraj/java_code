package Lecture_06Array.Array_ques.SubArrayQues;

public class SubArrays {

    public static void printSubArr(int num[])
    {
        int tp = 0;
       // int sum = 0;
        for(int i = 0; i <num.length; i++)
        {
            int st = i;
            for(int j=i; j<num.length; j++)
            {
                int en = j;
                for(int k = st; k<=en; k++)
                {
                    System.out.print(num[k]+ " ");
                    //sum += num[k];
                }
                tp++;
                
                //System.out.println("sum of pairs: " + sum);
            }
            System.out.println();
        }
        System.out.println("total pair is: "+ tp);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        printSubArr(num);
    }
}
