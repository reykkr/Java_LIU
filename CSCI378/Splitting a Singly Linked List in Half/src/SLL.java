class SLL {
    SLLNode head;

    public SLL() {
        this.head = null;
    }

    public void insert(int data) {
        SLLNode newNode = new SLLNode(data);
        if (head == null) {
            head = newNode;
        } else {
            SLLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printList() {
        SLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
