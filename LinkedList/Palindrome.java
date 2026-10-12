class Palindrome {

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

    //Check Palindrome
    public boolean checkPalin() {

        //Base Case 
        if (head == null || head.next == null) {
            return true; 
        }
        //Find Mid Node
        Node midNode = findMid(head);  

        //Reverse the 2nd half
        Node prev = null; 
        Node curr = midNode; 
        Node next; 
        while (curr != null) {
            next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next; 
        }

        Node right = prev; //Right half head 
        Node left = head; 

        //Compare right and left half
        while (right != null) {
            if (left.data != right.data) {
                return false; 
            }
            left = left.next; 
            right = right.next; 
        }

        return true; 

    }


    public static void main(String[] args) {

        Palindrome ll = new Palindrome();

        ll.addFirst(1); 
        ll.addFirst(2); 
        ll.addFirst(2); 
        ll.addFirst(4); 

        ll.printLL();

        System.out.println(ll.checkPalin()); 

        
    }
}