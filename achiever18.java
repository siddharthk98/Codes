// You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query,
// print the phone number of that person.

// Input Format

// The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

// Sample Input

// 3
// uncle sam
// 99912222
// tom
// 11122222
// harry
// 12299933
// uncle sam
// uncle tom
// harry
// Sample Output

// uncle sam=99912222
// Not found
// harry=12299933

import java.util.*;
class achiever18
{
    public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);	     
		System.out.println("Enter No of Records : ");	
		int n=in.nextInt();   
		in.nextLine();
	    HashMap<String,Integer> m1=new HashMap<>(); 
	    for(int i=0;i<n;i++)
	    {	    	  
	  	  System.out.println("Name " + (i+1) + ":");
	   	  String name=in.nextLine();
	   	  System.out.println("Number " + (i+1) + ":");
	   	  int phone=in.nextInt();   
	      m1.put(name, phone);        
	   	  in.nextLine();  
	    }
	      while(in.hasNext())
	      {
	        String s=in.nextLine();	      
	        if(m1.get(s)!=null)	         
               System.out.println(s+"="+m1.get(s));
	        else
	           System.out.println("Not found");
	      }
	}
} 