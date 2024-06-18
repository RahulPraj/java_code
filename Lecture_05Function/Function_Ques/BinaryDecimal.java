package Lecture_05Function.Function_Ques;

public class BinaryDecimal {

    public static void BinDec(int n){
        int binNum = n;
        int pow = 0;
        int decNum = 0;

        while(n > 0)
        {
            int ld = n % 10;
             decNum = decNum + (ld * (int)Math.pow(2, pow));
             pow++;
            
             n = n/10;

            
        }
        System.out.print("convert binary " + binNum + " to decimal : " + decNum );
    }
    public static void main(String[] args) {
        BinDec(101);
    }
}
