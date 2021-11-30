public class Trees {
    private Node root;

    /**
     * Inserts a new node.
     * If the root is empty, sets the node as root.
     * @param value value to be added as new node.
     */
    public void insertValue(int value){
        if(root == null){                                       // if root is empty, sets the node as root.
            this.root = new Node(value);
            return;
        }
        Node currentNode = root;                                // gets the root as current node.
        while(true) {
            if (value < currentNode.getValue()) {               // if the node value is less than root,
                if (currentNode.getLeftChild() == null) {       // sets it as left child if the left child is empty
                    currentNode.setLeftChild(new Node(value));  // wraps the value as the node and set it as left child.
                    break;
                }
                currentNode = currentNode.getLeftChild();        // if there is left child is not null, then set
            } else {                                             // current node to already available left child.
                if (currentNode.getRightChild() == null) {       // continues until it finds the correct node.
                    currentNode.setRightChild(new Node(value));
                    break;
                }
                currentNode = currentNode.getRightChild();
            }
        }
        }

    /**
     * Checks whether the given value is in the tree.
     * @param value value to be searched.
     * @return true  if the value is in the tree
     *         false if the value is not in the tree.
     */
    public boolean findValue(int value){
        Node currentNode = root;                                // Get the root value
        while(currentNode != null){                             // Breaks the loop if the node is null. i.e
            if(value<currentNode.getValue())                    // Searched the whole tree.
                currentNode= currentNode.getLeftChild();        // checks if the value is smaller or greater and
            else if(value > currentNode.getValue())             // moves accordingly and returns true when found.
                currentNode = currentNode.getRightChild();
            else
                return true;
            }
        return false;
        }

    /**
     * Traverses the tree in "pre-order"
     * ROOT -> LEFT -> RIGHT.
     * @param root root node to start the traversal at
     */
        private void traversePreOrder(Node root) {
            if (root == null) {                             // base case to end the recursion.
                return;
            }

            System.out.print(root.getValue() + " ");
            traversePreOrder(root.getLeftChild());
            traversePreOrder(root.getRightChild());
        }

    /**
     * Traverses the tree in "inorder"
     * LEFT -> ROOT -> RIGHT.
     * @param root root node to start the traversal at
     */
    private void traverseInOrder(Node root){
        if(root == null){
            return;
        }

            traverseInOrder(root.getLeftChild());
            System.out.print(root.getValue() + " ");
            traverseInOrder(root.getRightChild());
        }

        public void heightTree(){
            System.out.println(heightTree(root));
        }


    /**
     * Returns the height of the given root.
      * @param root Root to find the height of
     * @return returns the height of the tree.
     */
    private int heightTree(Node root){
            if(root == null)
                return -1;
            if(root.getRightChild() == null && root.getLeftChild() == null){
                return 0;
            }
        return 1 + Math.max(heightTree(root.getLeftChild()),
                            heightTree(root.getRightChild()));
        }

        public void minimumOfTree(){
            System.out.println(minimumOfTree(root));
        }

        public void minOfBinarySearchTree(){
            Node current = root;
            Node last = current;
            while(current != null){
                last = current;
                current = last.getLeftChild();
            }
            System.out.println(last.getValue());
        }


        private int minimumOfTree(Node root) {
            if (root.getRightChild() == null && root.getLeftChild() == null) {
                return root.getValue();
            }
            int left = minimumOfTree(root.getLeftChild());
            int right = minimumOfTree(root.getRightChild());
            return Math.min(Math.min(left, right), root.getValue());
        }


        public static void main(String[] args) {
            Trees trees = new Trees();
            trees.insertValue(7);
            trees.insertValue(4);
            trees.insertValue(9);
            trees.insertValue(1);
            trees.insertValue(6);
            trees.insertValue(8);
            trees.insertValue(10);
            trees.traversePreOrder(trees.root);


    }
}


