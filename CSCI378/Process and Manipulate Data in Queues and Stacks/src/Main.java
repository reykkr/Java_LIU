public class Main {
    public static Queue newQueue(Queue q1) {
        Queue q2 = new Queue();
        while (!q1.isEmpty()) {
            int x = q1.head().getNum();
            if (x % 2 == 0)
                q2.enqueue(new NodeData(x * 2));
            else
                q2.enqueue(new NodeData(x - 2));
            q1.dequeue();
        }
        return q2;
    }
}