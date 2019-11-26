/*Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.
I/p : 5 5 9
1 2 4 5 7
5 6 3 4 8

I/p : 2 2 3
0 2
1 3

O/p : 1 8, 4 5, 5 4
O/p :  0 3, 2 1
*/
import java.util.*;
class achiever13
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int arr1[] = new int[A];
        int B = s.nextInt();
        int arr2[] = new int[B];
        int x = s.nextInt();
        System.out.println("Enter Elements of A");
        for(int i=0;i<A;i++)
        {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter Elements of B");
        for(int i=0;i<B;i++)
        {
            arr2[i] = s.nextInt();
        }
        for(int i=0;i<A;i++)
        {
            for(int j=0;j<B;j++)
            {
                if( (arr1[i] + arr2[j]) == x )
                {
                    System.out.print(arr1[i]+",");
                    System.out.println(arr2[j]+" ");
                }
            }
        }
    }
}