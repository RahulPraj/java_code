package Lecture_05Function.Function_Ques;

public class Coefficient {

    public static int fact(int n){
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f *=i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int bCoeff = (fact_n) / (fact_r * fact_nmr);
        return bCoeff;
    }
    public static void main(String[] args) {
        System.out.print(binCoeff(5, 2));
    }
}
