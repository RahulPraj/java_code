

public class Substring {

    public static String subStr(String str, int si, int ei)
    {
        String subst = "";
        for(int i = si; i < ei; i++)
        {
            subst += str.charAt(i);
        }
        return subst;

    }
    public static void main(String[] args) {
        String  str = "helloworld";
        System.out.print(subStr(str, 0, 5));
    }
}
