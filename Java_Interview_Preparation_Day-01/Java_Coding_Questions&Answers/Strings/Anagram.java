import java.util.*;
public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String1:");
        String s1=sc.next();
        System.out.println("Enter a String2:");
        String s2=sc.next();

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        if(charArray1.length!=charArray2.length)
        {
            System.out.println("Entered Strings are not anagrams");
            return;
        }

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for(int i=0;i<=charArray1.length-1;i++)
        {
                if(charArray1[i]!=charArray2[i])
                {
                    System.out.println("Entered Strings are not anagrams");
                    return;
                }
            
            
        }

        System.out.println("Entered Strings are anagrams");
        sc.close();



    }
}