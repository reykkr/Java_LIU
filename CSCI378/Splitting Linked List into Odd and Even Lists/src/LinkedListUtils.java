import java.util.LinkedList;

public class LinkedListUtils {

    public static void splitList(LinkedList<Integer> source, LinkedList<Integer> odd, LinkedList<Integer> even) {
        for (Integer value : source) {
            if (value % 2 == 0) {
                even.add(value);
            } else {
                odd.add(value);
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> source = new LinkedList<>();
        source.add(1);
        source.add(2);
        source.add(3);
        source.add(4);
        source.add(5);

        LinkedList<Integer> odd = new LinkedList<>();
        LinkedList<Integer> even = new LinkedList<>();

        splitList(source, odd, even);

        System.out.println("Original List: " + source);
        System.out.println("Odd List: " + odd);
        System.out.println("Even List: " + even);
    }
}
