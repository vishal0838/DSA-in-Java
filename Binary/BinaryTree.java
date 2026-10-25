class BinaryTree {

    static class Node {
        int data; 
        Node right; 
        Node left; 

        public Node(int data) {
            this.data = data; 
            this.right = null;
            this.left = null;  

        }        
    }

    static class BinaryTr {
        static int idx = -1; 
        public static Node builtBT(int nodes[]) {
            idx++; 
            if (nodes[idx] == -1) {
                return null; 
            }

            Node newNode = new Node(nodes[idx]); 
            newNode.left = builtBT(nodes); 
            newNode.right = builtBT(nodes);  

            Node root = newNode; 
            return root; 
            
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            inOrder(root.left);
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return; 
            } 

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 

        BinaryTr tree = new BinaryTr(); 
        Node root = tree.builtBT(nodes);
       
       tree.postOrder(root); 

        
    }
}