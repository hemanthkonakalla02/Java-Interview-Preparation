import java.util.*;
public class ReverseStringWithTwoPointers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
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

        System.out.println("The Reverse of entered String is :"+new String(charArray));
        sc.close();
    }
}