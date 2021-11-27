import java.util.Stack;

public class StackProblems {
    public void reverseString(String input){
        if(input == null){
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        System.out.println("The word given by the user is : " + stack.toString());
        StringBuffer reversedString = new StringBuffer();
        while(!stack.isEmpty()){
          reversedString.append(stack.pop());
        }
        System.out.println(reversedString.toString());
    }

    public static void main(String[] args) {
        StackProblems stackProblems = new StackProblems();
        try{
            stackProblems.reverseString(null);
        }catch (IllegalArgumentException iae){
            System.out.println("The string is empty !");
        }

    }
}

