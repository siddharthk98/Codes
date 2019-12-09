// Write a Java program to insert a node into the middle of the linked list
// Input : list: 1->2->4->5
//         x = 3
// Output : 1->2->3->4->5

// Input : list: 5->10->4->32->16
//         x = 41
// Output : 5->10->4->41->32->16
import java.util.*;
class achiever24
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void addAtEnd(int data)
    {
        Node new_node = new Node(data);
        
        if(head == null)
        {
            head=new_node;
        }
        else
        {
            Node last = new Node(data);
            last.next=null;
            last = head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next = new_node; 
        }
    }
    public void addAtMiddle(int data)
    {
        int count=0;
        Node new_M_Node = new Node(data);
        if(head == null)
        {
            head = new_M_Node;
        }
        else
        {
            int i=1;
            Node ptr = new Node(data);
            ptr = head;
            while(ptr.next!=null)
            {
                count++;
                ptr = ptr.next;
            }
            int len = ((count % 2) == 0) ? (count / 2) : (count + 1) / 2;
            ptr = head;
            while(i<len)
            {
                ptr=ptr.next;
                i++;
            }
            new_M_Node.next = ptr.next;
            ptr.next = new_M_Node; 
        }
    }
    public void display() 
    {  
        Node disp = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return;  
        }  
        while(disp != null) 
        {   
            System.out.print(disp.data + " ");  
            disp = disp.next;  
        }  
        System.out.println();  
    }
    public static void main(String[] args) 
    {
        achiever24 llist = new achiever24();
        
        llist.addAtEnd(1);
        llist.addAtEnd(2);
        llist.addAtEnd(4);
        llist.addAtEnd(5);
        
        llist.addAtMiddle(3);
        llist.display();
    }
}