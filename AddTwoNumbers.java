package leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new  ListNode(3);

		ListNode l2 = new ListNode(5);
		l1.next = new ListNode(6);
		l1.next.next = new  ListNode(4);
		AddTwoNumbers solution = new AddTwoNumbers();
		ListNode l3 = solution.addTwoNumbers(l1,l2);
		//[2,4,3]
//[5,6,4]

	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return makeList(l1,l2);
   
   }

    ListNode makeList(ListNode l1, ListNode l2){
        ListNode ln = new ListNode(0);
        ListNode ret = ln;
        int carry = 0,num1,num2,sum;
        while((l1!= null) || (l2!=null)){
            num1 = (l1!=null)?l1.val:0;
            num2 = (l2!=null)?l2.val:0;
            sum = num1 + num2 + carry;
            carry = (sum >= 10)?1:0;
            ln.next = new ListNode(sum%10);
 
            if(l1 !=null ){
                l1 = l1.next;
            }
            if(l2 !=null ){
                l2 = l2.next;
            }
            ln = ln.next;
        }
        if(carry > 0){
            ln.next = new ListNode(carry);
        }
        return ret.next;
    }
   

}
