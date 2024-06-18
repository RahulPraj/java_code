package Lecture_05Function.Function_Ques;

public class Product {

    public static int multiply(int a, int b){
        int prod = a * b;
        return prod;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int pr = multiply(a, b);
        System.out.print(pr);
    }
}
