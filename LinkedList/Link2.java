class Link2 {

    public static class Node {
        int data; 
        Node next; 

        public Node(int data) {
            this.data = data; 
            this.next = next; 
        }
        
    } 

    public static Node head; 
    public static Node tail;
    public static int size;  


    //Find out a mid Node
    public Node findMid(Node head) {
        Node slow = head; 
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = head.next; 
            fast = head.next.next; 
        }

        return slow; 
    }


    public static void main(String[] args) {

        Link2 ll = new Link2(); 

        
    }
}