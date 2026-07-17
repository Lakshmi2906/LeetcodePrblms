/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
      List<Integer> ls=new ArrayList<>();
      while(head!=null){
        ls.add(head.val);
        head=head.next;
      }
      int left=0,right=ls.size()-1;
      while(left<right && ls.get(left)==ls.get(right)){
        left++;
        right--;
      }
      return left>=right;
    }
}