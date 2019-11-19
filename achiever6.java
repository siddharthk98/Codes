import java.util.*;
class achiever6
{
    static void in()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        check_frq(arr,n);
    }
    static void check_frq(int arr[],int n)
    {
        boolean check[] = new boolean[20];
        
        for(int i=0;i<20;i++)
        {check[i]=false;}
        
        for(int i=0;i<n;i++)
        {
            if(check[i]!=false)
            continue;

            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    check[j] = true;
                }
            }
            System.out.println(arr[i] + " - " + count);
        }
    }
    public static void main(String args[])
    {
        in();
    }
       
}