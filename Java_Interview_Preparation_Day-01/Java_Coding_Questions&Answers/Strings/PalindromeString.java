import java.util.*;
public class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String:");
            String s=sc.next();
            String s1=s;
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

            String res=new String(charArray);
            if(res.equals(s1))
            {
                System.out.println("Entered String is palindrome");
            }
            else
            {
                System.out.println("Entered String is not palindrome");
            }

            sc.close();
    }
    


    

}