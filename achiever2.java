import java.util.*;
class achiever2
{  
    static String str;
    static void in()
    {
        Scanner s = new Scanner (System.in);
        str = s.next();
        reverse(str);
    }
    static void reverse(String str)
    {
        char arr[] = str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if((arr[i]<65) || (arr[j]>90 && arr[i]<97) || (arr[j]>122))
            {
                i++;
                continue;
            } 
            if((arr[i]<65) || (arr[j]>90 && arr[i]<97) || (arr[j]>122))
            {
                j--;
                continue;
            } 
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr); 

    }

    public static void main (String args[])
    {
        in();
    }
}