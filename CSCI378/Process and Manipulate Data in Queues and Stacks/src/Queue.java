import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {
    private LinkedList<NodeData> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(NodeData data) {
        list.addLast(data);
    }

    public NodeData dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public NodeData head() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
    }
}