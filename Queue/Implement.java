

//Implemention using array
public class Implement {

    public static class Queue {
        int size; 
        int arr[]; 
        int rear; 

        public Queue(int n) {
            arr = new int[n]; 
            size = n; 
            rear = -1; 
        }

        public boolean isEmpty() {
            return rear == -1; 
        }

        //Add function 
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return; 
            }

            rear = rear + 1; 
            arr[rear] = data; 
        }

        //Remove operation 
        public int remove () {
            if (isEmpty()) {
                System.out.println("empty queue");
            }

            int front = arr[0]; 
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1]; 
            }
            rear = rear - 1; 
            return front; 
        }

        //Peek Operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1; 
            }
            return arr[0]; 
        }   
    }


    //Circular Queue
     public static class CircularQueue {
        int size; 
        int arr[]; 
        int rear; 
        int front; 


        public CircularQueue(int n) {
            arr = new int[n]; 
            size = n; 
            rear = -1; 
            front = -1; 
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1; 
        }

        public boolean isFull() {
            return (rear + 1) % size == front; 
        }

        //Add function 
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return; 
            }

            if (front == -1) {
                front = 0; 
            }
            rear = (rear + 1) % size; 
            arr[rear] = data; 
        }

        //Remove operation 
        public int remove () {
            if (isEmpty()) {
                System.out.println("empty queue");
            }

            int result = arr[front]; 
            front = (front + 1)%size; 

            //last element delete 
            if (rear == front ) {
                rear = front = -1; 
            } else {
                front = (front + 1)%size; 
            }
            return result; 
            
        }

        //Peek Operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1; 
            }
            return arr[0]; 
        }   
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5); 
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove(); 
        }

    }
}