import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<NodeData> stack = new Stack<>();
        
        stack.push(new NodeData(3));
        stack.push(new NodeData(2));
        stack.push(new NodeData(-9));
        stack.push(new NodeData(4));

        System.out.println("Original Stack:");
        System.out.println(stack);

        Stack<NodeData> shakenStack = shake.shakeStack(stack);

        System.out.println("\nShaken Stack:");
        System.out.println(shakenStack);
    }
}