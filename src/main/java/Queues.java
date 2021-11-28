
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * We use LIFO and FIFO principles to
 * solve the reversing problem.
 */
public class Queues {
    public void reverse(Queue<Integer> numbers){
        System.out.println("The given number are : ");
        Stack<Integer> stackNum = new Stack<>();
        while(!numbers.isEmpty()) {
            stackNum.push(numbers.remove()); // removing the first item from queue and adding to a stack.
        }
        while(!stackNum.isEmpty()){
            numbers.add(stackNum.pop()); // Removing the last item from stack and adding it to queue again.
        }
        System.out.println(numbers);
    }


    public static void main(String[] args) {
        Queues queues = new Queues();
        Queue<Integer> numbers= new ArrayDeque<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(59);
        queues.reverse(numbers);


    }
}
