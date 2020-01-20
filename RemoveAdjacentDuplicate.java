/*
Given a string s, recursively remove adjacent duplicate characters from the string s. The output string should not have any adjacent duplicates.
 
Input:
The first line of input contains an integer T, denoting the no of test cases. Then T test cases follow. Each test case contains a string str.

Output:
For each test case, print a new line containing the resulting string.

Constraints:
1<=T<=100
1<=Length of string<=50

Example:
Input:
2
geeksforgeek
acaaabbbacdddd

Output:
gksforgk
acac
*/
import java.util.*;
class RemoveAdjacentDuplicate
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int t=0;t<T;t++)
        {
            String str = s.next();
            char ch[] = str.toCharArray();
            int n = ch.length;
            if(ch[0]!=ch[1])
                System.out.print(ch[0]);
            for(int i=1;i<n-1;i++)
            {
                if(ch[i]!=ch[i+1] && ch[i]!=ch[i-1])
                {
                    System.out.print(ch[i]);
                }
            }
            if(ch[n-1]!=ch[n-2])
                System.out.print(ch[n-1]);
        }
    }
}