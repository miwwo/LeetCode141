import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        HashSet<ListNode> Nodes = new HashSet<>();
        ListNode curNode = head;
        while (curNode != null) {
            if (Nodes.contains(curNode))
                return true;

            Nodes.add(curNode);
            curNode = curNode.next;
        }

        return false;
    }
}
