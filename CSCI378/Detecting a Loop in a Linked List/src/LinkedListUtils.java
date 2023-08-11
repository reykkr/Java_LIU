public class LinkedListUtils {

    public static boolean hasLoop(Node head, int n) {
        if (n <= 0) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        first.next = second;
        second.next = third;
        third.next = second; 

        int n = 3; 

        boolean hasLoop = hasLoop(first, n);
        System.out.println("Linked List has a loop: " + hasLoop);
    }
}
