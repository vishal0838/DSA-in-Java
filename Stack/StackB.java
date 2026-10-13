import java.util.*; 

public class StackB {
    
    //ArrayList
    static class Stack {
        
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            if (list.isEmpty()) {
                return true; 
            };  

            return false; 
        }

        //Add 
        public static void push(int data) {
            list.add(data); 
        }

        //Remove
        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(top); 
            return top;  
        } 

        //Peek
        public static int peek(){
            int top = list.get(list.size() - 1); 
            return top; 
        }
 
    }
    
    public static void main(String[] args) {
        Stack s = new Stack(); 
        Stack.push(1); 
        Stack.push(2); 
        Stack.push(3); 

        while (!Stack.isEmpty()) {
            System.err.println(s.peek());
            Stack.pop(); 
        }
    }
}