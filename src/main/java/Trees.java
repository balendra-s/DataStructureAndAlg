public class Trees {
    private Node root;

    public void insertValue(int value){
        if(root == null){
            this.root = new Node(value);
            return;
        }
        Node currentNode = root;
        while(true) {
            if (value < currentNode.getValue()) {
                if (currentNode.getLeftChild() == null) {
                    currentNode.setLeftChild(new Node(value));
                    break;
                }
                currentNode = currentNode.getLeftChild();
            } else {
                if (currentNode.getRightChild() == null) {
                    currentNode.setRightChild(new Node(value));
                    break;
                }
                currentNode = currentNode.getRightChild();
            }
        }
        }

        public boolean findValue(int value){
        Node currentNode = root;
        while(currentNode != null){
            if(value<currentNode.getValue())
                currentNode= currentNode.getLeftChild();
            else if(value > currentNode.getValue())
                currentNode = currentNode.getRightChild();
            else
                return true;
            }
        return false;
        }

        public int factorialUsingRecursion(int limit){

            if(limit == 0)
                return 1;
            int factResult = limit * factorialUsingRecursion(limit-1);
            System.out.println(limit + " " + factResult);
            return factResult;
        }

        public void traverse(){
        traverseInOrder(root);
        traversePreOrder(root);
        }
        private void traversePreOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.getValue());
            traversePreOrder(root.getLeftChild());
            traversePreOrder(root.getRightChild());
        }

        private void traverseInOrder(Node root){
        if(root == null){
            return;
        }
            traverseInOrder(root.getLeftChild());
            System.out.println(root.getValue());
            traverseInOrder(root.getRightChild());
        }

        public void heightTree(){
            System.out.println(heightTree(root));
        }

        // formal for height of the tree in binary search is
        // 1 + max(leftChild,rightChild)
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

        public void findX(int sum){
            int delSum = 0 ;
            delSum = (sum - 20) / 4;
            System.out.println("Første person får : " + delSum);
            System.out.println("Andre person får : "+ (2*delSum));
            System.out.println("Tredje person får : " + (delSum+20));
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
//      System.out.println(trees.findValue(11));
//      trees.factorialUsingRecursion(10);
//      trees.traverse();
//      trees.heightTree();
        trees.minimumOfTree();
        trees.minOfBinarySearchTree();


    }
}


