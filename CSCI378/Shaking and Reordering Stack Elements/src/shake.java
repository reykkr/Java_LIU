import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class shake {

    public static Stack<NodeData> shakeStack(Stack<NodeData> s1) {
        Queue<NodeData> q = new LinkedList<>();
        Stack<NodeData> s2 = new Stack<>();
        Stack<NodeData> s3 = new Stack<>();
        
        while (!s1.isEmpty()) {
            NodeData nd = s1.pop();
            if (nd.getNum() > 0) {
                s2.push(nd);
            } else {
                q.add(nd);
            }
            s3.push(nd);
        }
        
        while (!q.isEmpty()) {
            s2.push(q.poll());
        }
        
        while (!s3.isEmpty()) {
            s1.push(s3.pop());
        }
        
        return s2;
    }
}