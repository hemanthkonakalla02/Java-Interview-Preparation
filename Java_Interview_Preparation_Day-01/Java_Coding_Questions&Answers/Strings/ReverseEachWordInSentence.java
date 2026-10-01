import java.util.*;
public class ReverseEachWordInSentence
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        
        char[] charArray=s.toCharArray();
        
        while(left<right)
        
        {
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }

        String s1 = new String(charArray);

       String split[]=s1.split(" ");
       for(int i=split.length-1;i>=0;i--)
       {

        System.out.print(split[i]+" ");

       }

       System.out.println("");
        sc.close();
    }
}