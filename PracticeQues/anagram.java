package PracticeQues;

public class anagram {
    // public static String anagramSol(String s1, String s2)
    // {
        
        
    // }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dcba";

        for(int i = 0; i < s1.length(); i++)
        {
            for(int j = s2.length()-1; j >= 0; j--)
            {
                if(s1.charAt(i) == s2.charAt(j))
                {
                    //
                }
                else
                {
                    System.out.println("its not a anagram");
                }
                
            }
            
        }
        
    }
}
