
import java.util.LinkedList;

class Deque {
    public static void main(String[] args) {
        java.util.Deque<Integer> d = new LinkedList<>(); 
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        d.addLast(4);
        d.removeLast(); 
        d.removeFirst(); 
        System.out.print(d + " ");
    }
}