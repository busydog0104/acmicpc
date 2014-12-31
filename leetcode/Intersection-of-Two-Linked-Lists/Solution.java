/*
====================================================
   Author: Hui Yang - yanghui_0104@163.com

   QQ : 471429305

   Last modified: 2014-12-21 14:29

   Filename: Solution.java

   Description: 
===================================================
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;
public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA , pb = headB , ans = null;
        int cnta = 0 , cntb = 0;
        if(pa == null || pb == null)
                return null;
        while(true){
           if((pa == null && cnta == 1) || (pb == null && cntb == 1))
                  break;
            if(pa == null && cnta == 0){
                cnta ++;
                pa = headB;
            } 
            if(pb == null && cntb == 0){
                cntb ++;
                pb = headA;
            }
            if(pa.val != pb.val){
                ans = null;
            }else if(ans == null){
                ans = pa;
            }
            pa = pa.next;
            pb = pb.next;
        }
        return ans;
    }
    
}
