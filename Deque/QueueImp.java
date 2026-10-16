
import java.util.Deque;
import java.util.LinkedList;

class QueueImp {

    public class Stack {
        Deque<Integer> d = new LinkedList<>(); 
        
        public void push(int data) {
            d.addLast(data);
        } 

        public int pop() {
           return d.removeFirst();  
        }

        public int peek() {
            return d.getFirst(); 
        }
    }
    public static void main(String[] args) {
        
    }
}