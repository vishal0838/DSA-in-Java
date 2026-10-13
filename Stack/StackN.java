
public class StackN {

    public static class StackB {

        static class Node {

            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static class Stack {
            static Node head = null; 

            public static boolean isEmpty() {
                return head == null; 
            }

            public static void push(int data) {
                Node newNode = new Node(data); 
                newNode.next = head; 
                head = newNode; 
            }

            public static int pop() {
                if (isEmpty()) {
                    System.out.println("List is empty");
                    return -1; 
                }

                int val = head.data; 
                head = head.next; 
                return val; 

            }

            public static int peek() {
                if (isEmpty()) {
                    System.out.println("List is empty");
                    return -1; 
                }
                return head.data; 
            }

            public void printLL(){
                if (isEmpty()) {
                    System.out.println("List is empty");
                    return; 
                }

                Node temp = head; 
                while (temp != null) {
                    System.out.print(temp.data);
                    if (temp.next != null) {
                        System.out.print(" -> ");
                    }
                    temp = temp.next; 
                }
                System.out.println();
            } 
        }
    }

    public static void main(String[] args) {
        StackB.Stack s = new StackB.Stack(); 

        StackB.Stack.push(1); 
        StackB.Stack.push(2); 
        StackB.Stack.push(3);

        s.printLL();


    }
}
