//public class LinkedCycle {
//    public boolean hasCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return false; // No cycle if list is empty or has only one node
//        }
//
//        ListNode slow = head; // Slow pointer
//        ListNode fast = head; // Fast pointer
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;       // Move slow pointer by one step
//            fast = fast.next.next;  // Move fast pointer by two steps
//
//            if (slow == fast) {
//                return true; // If slow and fast meet, there's a cycle
//            }
//        }
//
//        return false; // If fast reaches the end, there's no cycle
//    }
//}