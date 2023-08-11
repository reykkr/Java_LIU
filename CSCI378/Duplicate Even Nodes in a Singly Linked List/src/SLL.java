class SLL {
    Node head;

    public SLL() {
        head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public SLL createduplicateEvenNodes(SLL source) {
        SLL result = new SLL();
        Node current = source.head;

        while (current != null) {
            if (current.data % 2 == 0) {
                result.addNode(current.data);
            }
            result.addNode(current.data); // Duplicating all nodes
            current = current.next;
        }

        return result;
    }
}