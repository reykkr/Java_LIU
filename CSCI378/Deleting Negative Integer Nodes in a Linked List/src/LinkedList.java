public class LinkedList {
    private Node head;
    public LinkedList() {
        head = null;
    }
    public void deleteNegative() {
        while (head != null && head.data < 0) {
            head = head.next;
        }

        if (head == null) {
            return; 
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data < 0) {
                current.next = current.next.next; 
            } else {
                current = current.next;
            }
        }
    }
}