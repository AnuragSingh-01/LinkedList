/*
  Code by Anurag Singh 
  @AnuragSingh-01
  
  ->It is the class having method for finding the Intersection of Two Linked List.
  ->Trick of this question is:-
             (i)find the length of both list.
             (ii)find difference of length.
             (iii)Balance the length of lists by moving the Head pointer lengthy list by the difference.
             (iv)Now length of both list from the intersection point is same and now you can find the intersection by using a loop.

 Thanks
*/



class Intersect
{
    public static int length(Node start)
    {
        int count=0;
        while(start!=null)
        {
            start=start.next;
            count++;
        }
        return count;
    }
	int intersectPoint(Node headA, Node headB)
	{
         // code here
         int s1=length(headA);
         int s2=length(headB);
         int diff=Math.abs(s1-s2);
         if(s1>s2)
         {
             while(diff!=0)
             {
                 headA=headA.next;
                 diff--;
             }
         }
         else
         {
             while(diff!=0)
             {
                 headB=headB.next;
                 diff--;
             }
         }
         
         while(headA!=null && headB!=null)
         {
             if(headA==headB)
             {
                 return headA.data;
             }
             headA=headA.next;
             headB=headB.next;
         }
         return -1;
	}
