import java.math.BigInteger;

class AddTwoNumLink {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyhead = new ListNode(0);
            ListNode current = dummyhead;
            int carry = 0;

            while(l1 != null || l2 != null|| carry != 0){
                int x = 0, y = 0;
                if(l1 != null){
                    x = l1.val;
                    l1 = l1.next;
                }

                if(l2 != null){
                    y = l2.val;
                    l2 = l2.next;
                }

                int sum = x + y + carry;

                carry = sum / 10;

                current.next = new ListNode(sum%10);

                current = current.next;
            }
            return current;
        }

        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }



    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
