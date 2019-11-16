import java.util.*;
class achiever4
{
    static int pallinlenght=0;
    static void in()
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = str.length();
        checksubstr(str,n);
    }
    static void checksubstr(String str,int n)
    {
        String substr[] = new String[250];
        String pallin[] = new String[230];
        int k = 0;
        int x = 0;
        int max=0;
        String ans="";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                substr[k] = str.substring(i,j);
                if(checkpallin(substr[k]))
                {
                    pallin[x] = substr[k]; 
                    if(pallin[x].length()>max)
                    {
                        ans=pallin[x];
                        max = pallin[x].length();
                    }
                }
                x++;
                k++;
            }
        }
        System.out.println(ans);
    }
    static boolean checkpallin(String k)
    {
        int i = 0, j = k.length() - 1;  
        while (i < j)
        { 
            if (k.charAt(i) != k.charAt(j)) 
                return false;
            i++; 
            j--; 
        }  
        return true; 
    }
    public static void main(String args[])
    {
        in();
    }
}