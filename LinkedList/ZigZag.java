
public class ZigZag {

    public static class Node{
        int data; 
        Node next; 

        public Node(int data){
            this.data = data; 
            this.next = null; 
        }
    }

    //Add first in link list
    public void addFirst(int data) {
        Node newNode = new Node(data); 
        size++; 

        if (head == null) {
            head = tail = newNode; 
            return; 
        }

        newNode.next = head; 
        head = newNode; 
    }

    //Print a LL
    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return; 
        }

        Node temp = head; 
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }
        System.out.println();
    }

    public void zigZag() {
        //Find Mid 
        Node slow = head; 
        Node fast = head.next; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }

        Node mid = slow; 

        //Reverse the Left half
        Node curr = mid.next; 
        mid.next = null; 
        Node prev = null;
        Node next;  

        while (curr != null) {
            next = curr.next ;
            curr.next = prev; 
            prev = curr; 
            curr = next; 
        }

        Node left = head; 
        Node right = prev; 
        Node nextL, nextR; 

        //Alternate Merge
        while (left != null && right != null) {
            nextL = left.next; 
            left.next = right; 
            nextR = right.next; 
            right.next = nextL; 

            left = nextL; 
            right = nextR; 
        }
    }

    public static Node head; 
    public static Node tail; 
    public static int size; 
    
    public static void main(String[] args) {
        ZigZag ll = new ZigZag(); 
        ll.addFirst(5); 
        ll.addFirst(4);
        ll.addFirst(3); 
        ll.addFirst(2); 
        ll.addFirst(1); 

        ll.printLL();
        ll.zigZag();
        ll.printLL();
    }
}