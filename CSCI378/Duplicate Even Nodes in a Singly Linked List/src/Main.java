public class Main {
    public static void main(String[] args) {
        SLL sourceList = new SLL();
        sourceList.addNode(3);
        sourceList.addNode(2);
        sourceList.addNode(-9);
        sourceList.addNode(4);

        System.out.println("Source List:");
        sourceList.display();

        SLL duplicateList = sourceList.createduplicateEvenNodes(sourceList);

        System.out.println("New List with Duplicated Even Nodes:");
        duplicateList.display();
    }
}
