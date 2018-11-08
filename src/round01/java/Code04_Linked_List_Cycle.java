package round01.java;

public class Code04_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        ListNode p = head, pre = head;
        while (p != null && p.next != null) {
            if (p.next == head) return true;
            p = p.next;
            pre.next = head;
            pre = p;
        }
        return false;
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

        // 有环链表
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node3;

//        System.out.println(head);

        boolean result = new Code04_Linked_List_Cycle().hasCycle(head);

        System.out.println(result);
    }
}
