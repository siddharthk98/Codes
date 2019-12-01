/*
Given an array of n integers where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
sorted = 2,3,4,7,9,12,56 
m = 3
Output: Minimum Difference is 2
We have seven packets of chocolates and
we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum
difference between maximum and minimum packet
sizes.
*/
import java.util.*;
class achiever17
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of Array ");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }    
        System.out.println("Enter value of M");
        int m = s.nextInt();
        findMin(arr,m,n);
    }
    static void findMin(int arr[],int m,int n)
    {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int a1=0,a2=0;
        for(int i=0; i+m-1<n ;i++)
        {
            int diff = arr[i+m-1] - arr[i]; 
            if (diff < min) 
            { 
                min = diff; 
                a1 = i; 
                a2 = i + m - 1; 
            }
        }
        System.out.println("ANS : "+(arr[a2]-arr[a1]));
    }
}