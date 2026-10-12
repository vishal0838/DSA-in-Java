import java.util.LinkedList; 

public class MergeSort {

    public static class Node{
        int data; 
        Node next; 

        public Node(int data){
            this.data = data; 
            this.next = null; 
        }
    }

    private Node getMid(Node head) {
        Node slow = head; 
        Node fast = head.next; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
        return slow; 
    }

    public static Node head; 
    public static Node tail; 

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); 
        Node temp = mergedLL; 

        while(head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1; 
                head1 = head1.next; 
                temp = temp.next; 
            } else {
                temp.next = head2; 
                head2 = head2.next; 
                temp = temp.next; 
            }
        }

        while (head1 != null) {
            temp.next = head1; 
            head1 = head2.next; 
            temp = temp.next; 
        }

        while (head2 != null) {
            temp.next = head2; 
            head2 = head2.next; 
            temp = temp.next; 
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

    public Node mergeSort(Node head) {

        if (head == null || head.next != null) {
            return head; 
        }
        //find mid
        Node mid = getMid(); 

        //left & right MS
        Node rightHead = mid.next; 
        mid.next = null; 
        Node newLeft = mergeSort(head); 
        Node newRight = mergeSort(rightHead); 

        //merge
        return merge(newLeft, newRight); 
    }
    public static void main(String[] args) {
        MergeSort ll = new MergeSort(); 
        ll.addFirst(1); 
        ll.addFirst(2); 
        ll.addFirst(3);  
    }
}