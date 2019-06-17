
/*
   class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
   I have used floyd algorithm for detecting loop.
   You can make the object of Class Loop and then call the detectLoop function with the required parameters.
   
*/



class Loop
{
    int detectLoop(Node head)
    {
       if(head==null)
          return -1;
       else if(head.next==null)
          return -1;
       else if(head.next==head)
         return 1;
       else 
       {
           Node fast=head.next;
           Node slow=head;
           while(fast!=null && fast.next!=null)
           {
               if(fast==slow)
                    return 1;
                fast=fast.next.next;
                slow=slow.next;
           }
       }
   return -1;
   
   }
}
