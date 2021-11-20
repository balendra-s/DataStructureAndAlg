public class Trees {
    private NodeTest root;

    /*private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node " + value;
        }
    }*/

    public void insertValue(int value){
        if(root == null){
            this.root = new NodeTest(value);
            return;
        }
        NodeTest currentNode = root;
        while(true) {
            if (value < currentNode.getValue()) {
                if (currentNode.getLeftChild() == null) {
                    currentNode.setLeftChild(new NodeTest(value));
                    break;
                }
                currentNode = currentNode.getLeftChild();
            } else {
                if (currentNode.getRightChild() == null) {
                    currentNode.setRightChild(new NodeTest(value));
                    break;
                }
                currentNode = currentNode.getRightChild();
            }
        }
        }

        public boolean findValue(int value){
        NodeTest currentNode = root;
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

        /*public void traverse(){
        traverseInOrder(root);
        }
        private void traversePreOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.value);
            traversePreOrder(root.leftChild);
            traversePreOrder(root.rightChild);
        }

        private void traverseInOrder(Node root){
        if(root == null){
            return;
        }
            traverseInOrder(root.leftChild);
            System.out.println(root.value);
            traverseInOrder(root.rightChild);
        }*/

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
        System.out.println(trees.findValue(11));
//        trees.factorialUsingRecursion(10);
//        trees.traverse();


    }
}


