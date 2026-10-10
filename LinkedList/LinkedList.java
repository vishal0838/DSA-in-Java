
public class LinkedList {

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

    //Add first in LinkList
    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        //s1 - create new node

        //s2 - newNode next = head
        newNode.next = head;

        //s3 - head = newNode
        head = newNode;
    }

    //Add last in LinkList
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    //Print a LinkList
    public void print() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    //Add in the middle of the linklist 
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Remove first in Linkedlist 
    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is Empty");
            return Integer.MIN_VALUE; 
        } else if (size == 1) {
            int val = head.data; 
            head = tail = null; 
            size = 0; 
            return val; 
        }
        int val = head.data; 
        head = head.next; 
        size--; 
        return val; 
    } 

    //Remove last in Linkedlist
    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE; 
        } else if (size == 1) {
            int val = tail.data; 
            head = tail = null; 
            size = 0; 
            return val; 
        }
        int i = 0; 
        Node prev = head; 
        while (i < size-2) {
            prev = prev.next; 
            i++; 
        }
        int val = prev.next.data; 
        prev.next = null; 
        tail = prev; 
        size--; 
        return val; 
    }

    //Iterative search in link list 
    public int itrSearch(int key) {
        Node temp = head; 
        int i = 0; 
        while (temp != null) {
            if (temp.data == key) {
                return i; 
            }
            temp = temp.next; 
            i++; 
        }

        return -1; 
    }

    public int helper(Node head , int key) {
        if (head == null) {
            return -1; 
        }

        if (head.data == key) {
            return 0; 
        }

        int idx = helper(head.next, key); 
        if (idx == -1) {
            return -1; 
        }

        return idx+1; 
    }

    //Recursive Search
    public int recSearch(int key) {
        return helper(head, key); 
    }

    //Reverse a Linked List
    public void reverse() {
        Node prev = null; 
        Node curr = tail = head; 
        Node next; 

        while (curr != null) {
            next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next; 
        }
        head = prev; 
    }

    //Delete from nth index
    public void deleteNth(int n) {
        int sz = 0; 
        Node temp = head; 
        while (temp != null) {
            temp = temp.next; 
            sz++; 
        } 
        if (n == sz) {
            head = head.next; //Remove
            return; 
        }
        int i = 1; 
        Node prev = head; 
        int iToFind = sz - n; 
        while (i < iToFind) {
            prev = prev.next; 
            i++;  
        }
    }

    //Check Palindrome
    public Node findMid(Node head) {
        Node slow = head; 
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }

        return slow; 

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);

        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.reverse();
        ll.print();

    }
}
