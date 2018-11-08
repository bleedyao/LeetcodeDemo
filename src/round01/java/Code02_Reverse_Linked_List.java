package round01.java;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Code02_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode tempNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tempNode;
        }
        return prev;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder temp = new StringBuilder("[" + val);
            ListNode tempNode = next;
            while (tempNode != null) {
                temp.append(", ").append(tempNode.val);
                tempNode = tempNode.next;
            }
            temp.append("]");
            return temp.toString();
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

        ListNode result = new Code02_Reverse_Linked_List().reverseList(head);

        System.out.println(result);
    }
}
