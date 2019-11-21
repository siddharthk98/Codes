/*
Given a singly linked list of size N. The task is to rotate the linked list counter-clockwise by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.
Input :8(size of linked list)
1 2 3 4 5 6 7 8(Elements in linked list)
4(k times rotation)
Output : 5 6 7 8 1 2 3 4 
*/

import java.util.*;
public class achiever7
{
   static class node
   {
    int data;
    node next;
    
   }
   static node head;
    public static node insert(node head,int data)
    {
        
       node temp=new node();
       temp.data=data;
       if(head==null)
       {
           head=temp;
       }
       else
        {
           node ptr=head;
           while(ptr.next!=null)
           {
               ptr=ptr.next;
           }
           ptr.next=temp;
        }
       return head;
    }
    public static void display(node head)
    {
       node p=head;
       while(p!=null)
        {
           System.out.print(p.data+"->");
           p=p.next;
        }
       System.out.println("Null");
       System.out.println("");
    }
    public static node rotate(node head,int m)
    {
        node ptr=head;
        node prev=head;
        
        while(m!=0)
        {
            prev=ptr;
            ptr=ptr.next;
            m--;
        }
        
        node t=head;
        while(t.next!=null)

        {
            t=t.next;
        }
        prev.next=null;
        t.next=head;
        head=ptr;
        
        return head;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of linked list: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of list: ");
        for(int i=0;i<n;i++)
        {
            head=insert(head,sc.nextInt());
        }
        System.out.println("Enter K");
        int o=sc.nextInt();
        System.out.println("Rotated linked list: ");
        if(o<=n)
        {
            head=rotate(head,o);
            display(head);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}



// class achiever7
// {

//     public static void main(String args[])
//     {
//         LinkedList llist = new LinkedList<>();
//         for(int i=0;i<n;i++)
//         {
//             llist.push(i);
//         }
//         System.out.print("Given List");
//         llist.printList();

//         llist.rotate(4);

//         System.out.println("Rotated Linke d List : ");
//         llist.printList();
//     }

//     void printList()
//     {
//         Node temp = head;
//         while(temp!=null)
//     }
// }
