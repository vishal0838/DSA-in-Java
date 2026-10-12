class Cycle {

    public static class Node {
        int data; 
        Node next; 

        public Node(int data) {
            this.data = data; 
            this.next = null; 
        }
        
    } 

    public static Node head; 
    public static Node tail;
    public static int size;  

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


    //Find out a mid Node
    public Node findMid(Node head) {
        Node slow = head; 
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }

        return slow; 
    }

    //Detect a cycle 
    public static boolean detectCyc(Node head) {
        Node slow = head; 
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) {
                return true; 
            }
        }

    return false; 
    }

    //Remove a cycle 
    public static void removeCye(Node head) {
        Node slow = head; 
        Node fast = head; 
        boolean cycle = false; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
            if (fast == slow) {
                cycle = true; 
                break;
            }
        }

        if (cycle == false) {
            System.out.println("Cycle does not exist");
            return;
        }

        slow = head; 
        Node prev = null; 
        while (slow != fast) {
            prev = fast; 
            slow = slow.next; 
            fast = fast.next; 
        }

        prev.next = null; 
}


    public static void main(String[] args) {


        Cycle ll = new Cycle(); 

        head = new Node(1); 
        Node temp = new Node(2); 
        head.next = temp; 
        head.next.next = new Node(3); 
        head.next.next.next = temp; 

        removeCye(head);
        //System.out.println(detectCyc(head));

        


        
    }

}