package structures;
import java.util.Stack;

public class stackStructure {
    public static void main(String[] args){
        Stack<Integer> numValue = new Stack<>();

        numValue.push(10);
        numValue.push(5);

        System.out.println("The top most number is: " + numValue.peek());
        System.out.println("Found and removed " + numValue.pop());
        System.out.println("The top most number is: " + numValue.peek());
        System.out.println("Found and removed " + numValue.pop());
        System.out.println("The stack is empty: " + numValue.isEmpty());

        numValue.push(15);
         System.out.println("The stack is empty: " + numValue.isEmpty());

    }
}

//Next: Stack implementaion using an array