/*Given an array of n elements and an integer k. The task is to find the count of subarray which has maximum element greater than K.

Input : arr[] = {1, 2, 3} and k = 2.
Output : 3
Explanation : All the possible subarrays of arr[] are 
{ 1 }, { 2 }, { 3 }, { 1, 2 }, { 2, 3 }, 
{ 1, 2, 3 }.
Their maximum elements are 1, 2, 3, 2, 3, 3.
There are only 3 maximum elements > 2*/

import java.util.*;
class achiever10
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int count=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int arrR[] = new int[20];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                ArrayList<Integer> arrL = new ArrayList<Integer>();
                for (int l=i; l<=j; l++)   
                {
                    arrL.add(arr[l]);
                } 
                System.out.println(arrL);
                arrR[j] = max(arrL);
                // System.out.println(arrR[j]+"is max in this");
                if(arrR[j]>k)
                count++;   
            }
        }
        System.out.println("No. of Max Elements of Subarrays Greater than " + k + " are " + count);
        // for(int i=0;i<arrR.length;i++)
        // {
        //     
        // }
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
