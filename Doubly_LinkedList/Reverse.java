public class Reverse {
    public class Node {
        int data; 
        Node prev; 
        Node next; 
        
        public Node(int data) {
            this.data = data; 
            this.next = null; 
            this.prev = null; 
        }

        public static Node head; 
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data); 
        size++; 
        if (head == null) {
            head = tail = newNode; 
            return; 
        }

        newNode.next = head; 
        head.prev = newNode; 
        head = newNode; 
    }

    //Remove First;
    public int removeFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return Integer.MIN_VALUE; 
        }

        if (size == 1) {
            int val = head.data; 
            head = tail = null; 
            size--; 
            return val; 
        }

        int val = head.data; 
        head = head.next; 
        head.prev = null; 
        size--; 
        return val; 
    }

    //Print 
    public void printLL() {
        Node temp = head; 
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next; 
        }
        System.out.println("null");
    }

 
    //add last 
    public void addLast(int data) {
        Node newNode = new Node(data); 
        size++; 
        if (head == null) {
            head = tail = newNode; 
            return; 
        }

        Node temp = head; 
        while (temp.next != null) {
            temp = temp.next; 

        }

        temp.next = newNode; 
        newNode.prev = temp; 
        tail = newNode; 
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return -1; 
        }

        if (size == 1) {
            int val = head.data; 
            head = tail = null; 
            size--; 
            return val; 
        }

        Node temp = head; 
        while (temp.next != null) {
            temp = temp.next; 
        }

        int val = temp.data; 
        Node curr = temp.prev; 
        curr.next = null; 
        tail = curr; 
        return val; 
    }

    //Reverse
    public void reverse() {
        Node curr = head; 
        Node prev = null; 
        Node next;  
        while (curr != null) {
            next = curr.next; 
            curr.next = prev; 
            curr.prev = next; 
            prev = curr; 
            curr = next; 
        }

        head = prev; 
    }
    public static void main(String[] args) {
        Reverse dll = new Reverse(); 

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);


        dll.printLL();
        dll.reverse();
        dll.printLL();
       
    }
}