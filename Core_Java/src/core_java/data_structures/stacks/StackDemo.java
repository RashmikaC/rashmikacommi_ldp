package core_java.data_structures.stacks;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args)
    {
        // Default initialization of Stack
        Stack stack1 = new Stack();

        // Initialization of Stack using Generics
        Stack<String> stack2 = new Stack<String>();

        stack1.push(4);
        stack1.push("A");
        stack1.push("Hello");

        stack2.push("A");
        stack2.push("B");
        stack2.push("C");

        System.out.println(stack1);
        System.out.println(stack2);

        Iterator itr = stack1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();


        System.out.println("The element at the top of the stack1 is: " + stack1.peek());
        System.out.println("Popped element: " + stack1.pop());
        System.out.println("Popped element: " + stack1.pop());
        System.out.println("Stack1 after pop operation " + stack1);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=size