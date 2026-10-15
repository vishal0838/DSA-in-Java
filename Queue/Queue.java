import java.util.*; 

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new LinkedList<>();
        q.add(1);
        System.out.println(q.poll());
    }
}