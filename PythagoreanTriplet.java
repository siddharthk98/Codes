/*
Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a^2 + b^2 = c^2.

Input:
The first line contains T, denoting the number of testcases. Then follows description of testcases. Each case begins with a single positive integer N denoting the size of array. The second line contains the N space separated positive integers denoting the elements of array A.

Output:
For each testcase, print "Yes" or  "No" whether it is Pythagorean Triplet or not (without quotes).

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= A[i] <= 1000

Example:
Input:
1
5
3 2 4 6 5

Output:
Yes

Explanation:
Testcase 1: a=3, b=4, and c=5 forms a pythagorean triplet, so we print "Yes"
*/
import java.util.*;
class PythagoreanTriplet
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int t=0;t<T;t++)
        {
            int n = s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = s.nextInt();
            }
            int flag = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    for(int k=j+1;k<n;k++)
                    {
                        if((arr[i]*arr[i])+(arr[j]*arr[j]) == (arr[k]*arr[k]))
                        {
                            System.out.println("Yes");
                            flag =1;
                            break;
                        }
                    }
                }
            }
            if(flag == 0)
                System.out.println("No");
        }
    }
    
}
