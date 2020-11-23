package CodingChallenges;

import java.util.ArrayList;
import java.util.List;

public class singlyLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(-129);
        head.next = new ListNode(-129);

        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head){
        ListNode by = head;
        List <Integer> nums = new ArrayList<Integer>();
        while(by != null){
            nums.add(by.val);
            by = by.next;
        }

        int start = 0, end = nums.size() -1;

        while(end >= start){
            if(!nums.get(start).equals(nums.get(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
}
