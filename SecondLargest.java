/*
Finding the second largest value in an array

Input -

array = [101, 11, 3, 4, 50, 69, 7, 8, 9, 0]

The output should look like this −

Largest - 101
Second - 69
*/
import java.util.*;
class SecondLargest
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int arr[] = {101,11,3,4,50,69,7,8,9,0};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Second Largest Element : " + arr[n-2]);
    }
}