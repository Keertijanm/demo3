/*REVERSE LINKEDLIST BETWEEN
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
 */
 public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy = new ListNode(-1);
        dummy.next = head;
// create an dummy node to  track head of ll  and leftprev easily 
        // add that dummy node before head node
        ListNode leftprev=dummy;
        ListNode curr =head;
 // step-1  get the pointer of node given left pos and 
        //also store the refernce  of it's prev node
        int j=1;
      while(j!=left){
          leftprev=leftprev.next;
           curr=curr.next;
          j++;
// step-2 reverse node from pos to rightpos and
        //also store reference of it's next node in the curr and reversed part start node in prev
        
    ListNode prev=null;
        for(int i=1;i<=right-left+1;i++){
             ListNode nextNode=null;
            if(curr.next!=null){
                nextNode=curr.next;
            }
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        // step-3 link the leftprev node to reversed part starting node
        // and  link reversed part end node  to curr)which currently refernce  given (right next node)
         // update pointer link reversed part to original ll
        leftprev.next.next=curr;
        leftprev.next=prev;
        return dummy.next;
    }



