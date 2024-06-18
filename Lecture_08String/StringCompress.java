public class StringCompress {

    public static String Compression(String str)
    {
        String stnew = "";
        for(int i = 0; i < str.length(); i++ )
        {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            stnew += str.charAt(i);
            if(count > 1)
            {
                stnew += count.toString();
            }
        }
        return stnew;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";

        System.out.println(Compression(str));
    }
}
