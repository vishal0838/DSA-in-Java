import java.util.LinkedList; 

public class Framework{

    public void midNode(Node head) {
        Node slow = head; 
        Node fast = head.next ; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 

        }
            
    }
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>(); 

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0); 

        System.out.println(ll); 
    }

}