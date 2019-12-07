// Write a Java program to find the highest prime factor of a number 
// i/p : 6
// o/p : 3
// i/p : 15
// o/p : 5
import java.util.*;
class achiever21
{
    static int num;
    static void in()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        num=s.nextInt();
        checkMaxPrimeFactor(num);        
    }
    static void checkMaxPrimeFactor(int num)
    {
        int arr[] = new int[40];
        int k=0;
        if(num <= 1)
            System.out.println("Not A Prime Number");

        for (int i=1;i<=num;i++) 
        {    
            //getting all the factors of a number in an array
            if (num%i==0) 
            {
                arr[k]=i;
                k++;
            }        
        }
        int ans=0;
        for(int i=k-1;i>=0;i--)
        {   
            //checking that array for primes from max element so to save time!
            int temp=0;
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    //means the no is not a prime no!
                    temp++;
                    break;
                }
            }
            if(temp==0)
            {
                //prime if temp remains 0 i.e the if loop doesn't run
                ans=arr[i];
                break;
            }   
        }
        System.out.println("Max Prime Factor : "+ans);

    }
    public static void main(String[] args) 
    {
        in();
    }
}