// Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. 
//The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

import java.util.*;
class achiever23
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of arr1 : ");
        int n = s.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter Elements of arr1 :");
        for(int i=0;i<n;i++)
            arr1[i]=s.nextInt();

        System.out.println("Enter length of arr2 : ");
        int m = s.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter Elements of arr2 :");
        for(int i=0;i<m;i++)
            arr2[i]=s.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int x=0,y=0,k=0;
        int arrR[] = new int[m+n];    
        while(x<n && y<m)
        {
            if(arr1[x]<arr2[y])
                arrR[k++] = arr1[x++];
            else
                arrR[k++] = arr2[y++];
        }
        while(x<n)
			arrR[k++]=arr1[x++];
		while(y<m)
            arrR[k++]=arr2[y++];
            
        System.out.println("Merged Array : ");
        for(int i=0;i<k;i++)
            System.out.print(arrR[i]+" ");
        
    }
}