package round01;

import java.util.List;

public class Code03_Swap_Nodes_In_Pairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode point = dummy;
        while (point.next != null && point.next.next != null) {
            ListNode node1 = point.next;
            ListNode node2 = point.next.next;
            point.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            point = node1;
        }
        return dummy.next;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            String temp = "[" + val;
            ListNode tempNode = next;
            while (tempNode != null) {
                temp += ", " + tempNode.val;
                tempNode = tempNode.next;
            }
            temp += "]";
            return temp;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(head);

        ListNode result = new Code03_Swap_Nodes_In_Pairs().swapPairs(head);

        System.out.println(result);
    }
}
