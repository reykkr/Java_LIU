public class Main {
    public static void splitListInHalf(SLL source, SLL firstHalf, SLL secondHalf) {
        if (source.head == null) {
            return; // Empty source list
        }

        SLLNode slowPtr = source.head;
        SLLNode fastPtr = source.head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        firstHalf.head = source.head;
        secondHalf.head = slowPtr.next;
        slowPtr.next = null;
    }

    public static void main(String[] args) {
        SLL sourceList = new SLL();
        sourceList.insert(1);
        sourceList.insert(2);
        sourceList.insert(3);
        sourceList.insert(4);
        sourceList.insert(5);

        SLL firstHalf = new SLL();
        SLL secondHalf = new SLL();

        splitListInHalf(sourceList, firstHalf, secondHalf);

        System.out.print("First half: ");
        firstHalf.printList();

        System.out.print("Second half: ");
        secondHalf.printList();
    }
}
