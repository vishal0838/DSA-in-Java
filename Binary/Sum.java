

class Sum {

    public static class Node{
        int data; 
        Node right; 
        Node left; 

        public Node(int data) {
            this.data = data; 
            this.right = null; 
            this.left = null; 
        }
    }

    public static int height (Node root) {
        if (root == null) {
            return 0; 
        }

        int lh = height(root.left); 
        int rh = height(root.right); 
        return Math.max(rh, lh) + 1; 
    } 

    public static int nodeCount(Node root) {
        if (root == null) {
            return 0; 
        }

        int lcount = nodeCount(root.left); 
        int rcount = nodeCount(root.right); 

        return lcount + rcount + 1; 
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0; 
        }

        int lsum = sum(root.left); 
        int rsum = sum(root.right); 
        return lsum + rsum + root.data; 
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4);   
        root.left.right = new Node(5);   
        root.right.left = new Node(6);   
        //root.right.right = new Node(7);   

        System.out.println(sum(root));
    }
}