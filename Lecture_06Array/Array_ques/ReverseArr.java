package Lecture_06Array.Array_ques;

public class ReverseArr {

    public static void reverse(int num[]){
        int st = 0;
        int en = num.length-1;
        while(st<en)
        {
            int temp = num[st];
            num[st] = num[en];
            num[en] = temp;
            st++;
            en--;
        }
    }
    public static void main(String[] args) {
        int num[] = {2,3,4,5,6,7,8};

        reverse(num);

        //print
        for(int i=0; i<num.length; i++)
        {
            System.out.print( " " + num[i]);
        }
        System.out.println();
    }
}
