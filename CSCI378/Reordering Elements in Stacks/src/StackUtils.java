import java.util.Stack;

public class StackUtils {

    public static void store(Stack<Integer> R, Stack<Integer> S, Stack<Integer> T) {
        Stack<Integer> temp = new Stack<>();

        while (!S.isEmpty()) {
            temp.push(S.pop());
        }

        while (!T.isEmpty()) {
            S.push(T.pop());
        }

        while (!temp.isEmpty()) {
            S.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> R = new Stack<>();
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        R.push(1);
        R.push(2);
        R.push(3);

        S.push(4);
        S.push(5);

        T.push(6);
        T.push(7);
        T.push(8);
        T.push(9);

        store(R, S, T);

        System.out.println("R: " + R);
        System.out.println("S: " + S);
        System.out.println("T: " + T);
    }
}
