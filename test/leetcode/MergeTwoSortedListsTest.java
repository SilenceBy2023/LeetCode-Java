package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {

        MergeTwoSortedLists.ListNode listNode = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode head = listNode;
        listNode.next = new MergeTwoSortedLists.ListNode(2);
        listNode = listNode.next;
        listNode.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists.ListNode listNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode head1 = listNode1;
        listNode1.next = new MergeTwoSortedLists.ListNode(3);
        listNode1 = listNode1.next;
        listNode1.next = new MergeTwoSortedLists.ListNode(5);

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        MergeTwoSortedLists.ListNode mergeTwoLists = mergeTwoSortedLists.mergeTwoLists(head, head1);
        System.out.println(mergeTwoLists.toString());
    }
}