/*
Given a string s, recursively remove adjacent duplicate characters from the string s. The output string should not have any adjacent duplicates.
I/p : geeksforgeek
        acaaabbbacdddd
O/p : gksforgk
          acac 
*/
import java.util.*;
class achiever12
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.next();
        char strQ[] = str.toCharArray();
        char chResult[] = new char[40];
        int l = str.length();        
        System.out.println("Output String : ");
        int n = str.length();
        int k=0;
        for(int i=0;i<n-1;i++)
        {
            if(i==0)
            {
                if(strQ[i] != strQ[i+1])
                {
                    chResult[k] = strQ[i]; 
                    k++;
                }
            }
            else
            {
                if(( strQ[i] != strQ[i+1] ) && (strQ[i] != strQ[i-1]) )
                {    
                    chResult[k] = strQ[i];
                    k++;
                } 
            }
        }  
        for(int i=0;i<k;i++)
        System.out.print(chResult[i]);
        if(str.charAt(l-2) != str.charAt(l-1))
        System.out.println(str.charAt(l-1));
    }
}