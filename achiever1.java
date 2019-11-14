import java.util.*;
class achiever1 
{ 
    static int num = 20;
	static int arr[] = new int[]{2,3,6,4,5}; 
	static void subArray(int n) 
	{ 
		for (int i=0; i <n; i++) 
		{ 
			int vsum=arr[i];
			for (int j=i+1; j<=n; j++) 
			{ 
				if(vsum==num)
				{
					System.out.println("Starting : "+i+"Ending : "+ (j-1));
				}
				if(vsum>num || j==n)
				break;
				vsum = vsum + arr[j];
			} 
		} 
	} 
	public static void main(String[] args) 
	{ 
		subArray(arr.length); 
	} 
} 
