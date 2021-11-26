public class LinkedList {

    private Node first;
    private Node last;

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
        this.value = value;
        }
    }

    public void addLast(int value){
        Node node = new Node(value);
        if(first == null){
            first = last = node;
        }else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if(first == null){
            first = last = node;
        }else{
            Node temp = first;
            first = node;
            first.next = temp;
        }
    }

    public int indexOf(int value){
        int index = 0;
        Node current = first;
        while(current != null) {
            if (value == current.value)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value){
        boolean isFound = false;
        Node current = first;
        while(current != null){
            if(current.value == value)
                isFound = true;
            current = current.next;
        }
        return isFound;
    }

    public void removeFirst(){
        if(first == null){
            System.out.println("the list is empty !");
        }
        else if(first == last){
               first = last = null;
            System.out.println("Removed the last item from the list !");
        }else{
           Node second = first.next;
           first.next = null;
           first = second;
        }
    }

    public void removeLast(){
        if(first == null){
            System.out.println("the list is empty !");
        }
        else if(first == last){
            first = last = null;
            System.out.println("Removed the last item from the list !");
        }else{
            Node current = first;
            Node previous = null;
            while(current != null){
                if(current.next == last){
                    previous = current;
                    last = previous;
                    last.next = null;
                    break;
                }
                current = current.next;
            }
        }
    }

    public int sizeOf(){
        int count = 0;
        Node current = first;
        while(current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.removeLast();
    }
}
