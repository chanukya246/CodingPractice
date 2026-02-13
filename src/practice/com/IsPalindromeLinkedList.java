package practice.com;

import java.util.Stack;

public class IsPalindromeLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);
        System.out.println(new IsPalindromeLinkedList().isPalindrome(head));
    }


    public boolean isPalindrome(ListNode head) {
        Stack<Integer> a = new Stack<>();
        while (head != null) {
            if (a.contains(head.val))
                a.pop();
            else
                a.push(head.val);
            head = head.next;
        }

        return (a.size() == 0);
    }

}
