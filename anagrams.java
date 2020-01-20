/*
Two strings, and , are called anagrams if they contain all the same characters in the same frequencies.
For example, the anagrams of CAT are CAT , ACT , TAC , TCA , ATC , and CTA .
Complete the function in the editor. If and are case-insensitive anagrams, print "Anagrams";
otherwise, print "Not Anagrams" instead.
*/
import java.util.*;
class anagrams
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Strings : ");
        String str1 = s.next();
        String str2 = s.next();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String strr1 = arr1.toString();
        String strr2 = arr2.toString();
        if(strr1.equals(strr2))
            System.out.print("Anagrams");
        else
            System.out.print("Not Anagrams");
    }
}