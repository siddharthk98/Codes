/*Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.
Input : 9 3
1 2 3 1 4 5 2 3 6
Output : 3 3 4 5 5 5 6
Explanation : Starting from first subarray of size k = 3, we have 3 as maximum. Moving the window forward, maximum element are as 3, 4, 5, 5, 5 and 6.*/

import java.util.*;
class achiever9
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                ArrayList<Integer> arrL = new ArrayList<Integer>();
                for (int l=i; l<=j; l++)   
                {
                    arrL.add(arr[l]);
                } 
                if(arrL.size()==k)
                {
                    int ans = max(arrL);
                    System.out.println(ans + " ");
                }
            }
            
        }
    }
        public static int max(ArrayList<Integer> arrL)
        {
            int largest = arrL.get(0);
            for(int i=0;i<arrL.size();i++)
            {
                if(arrL.get(i)>largest)
                {
                    largest = arrL.get(i);
                }
            }
            return largest;
        } 
}
