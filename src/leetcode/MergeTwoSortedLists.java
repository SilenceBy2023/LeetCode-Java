package leetcode;


public class MergeTwoSortedLists {
    /**
     Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

     Example:

     Input: 1->2->4, 1->3->4
     Output: 1->1->2->3->4->4
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //自己写的代码
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        ListNode head = null;
//        ListNode curNode = null;
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                ListNode node = new ListNode(l1.val);
//                if (curNode!= null) {
//                    curNode.next = node;
//                    curNode = curNode.next;
//                }
//                if (head == null) {
//                    curNode = node;
//                    head = node;
//                }
//                l1 = l1.next;
//            } else if (l1.val > l2.val) {
//                ListNode node = new ListNode(l2.val);
//                if (curNode!= null) {
//                    curNode.next = node;
//                    curNode = curNode.next;
//                }
//                if (head == null) {
//                    curNode = node;
//                    head = node;
//                }
//                l2 = l2.next;
//            } else {
//                ListNode node = new ListNode(l1.val);
//                if (curNode!= null) {
//                    curNode.next = node;
//                    curNode = curNode.next;
//                }
//                if (head == null) {
//                    curNode = node;
//                    head = node;
//                }
//                l1 = l1.next;
//                ListNode node1 = new ListNode(l2.val);
//                if (curNode!= null) {
//                    curNode.next = node1;
//                    curNode = curNode.next;
//                }
//                l2 = l2.next;
//            }
//        }
//        if (l1 == null) {
//            curNode.next = l2;
//        }
//        if (l2 == null) {
//            curNode.next = l1;
//        }
//        return head;
        //第二种写法
        ListNode head = new ListNode(0);
        ListNode p=head;

        ListNode list1 = l1;
        ListNode list2 = l2;
        while(list1 !=null && list2!=null){

            if(list1.val <=list2.val){
                p.next = list1;
                list1 = list1.next;
            }
            else{
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1!=null){
            p.next = list1;
        }
        if(list2!=null){
            p.next = list2;
        }

        return head.next;
    }
}
