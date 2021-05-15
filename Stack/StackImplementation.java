import java.util.*;

public class StackImplementation {
    public static void main(String... args) {
        Stacks st = new Stacks();
        System.out.println(st.push(12));
        System.out.println(st.push(13));
        System.out.println(st.push(14));
        System.out.println(st.push(15));
        System.out.println(st.pop());
        System.out.println(st.peek());

    }
}

class Stacks {
    private int stack[] = new int[1000];
    int top;

    public Stacks() {
        top = -1;
    }

    public String push(int value) {
        if (top == 1000) {

            return "Stack Overflow";
        } else {
            top++;
            stack[top] = value;
            return "Pushed";
        }
    }

    public int pop() {
        if (top == -1) {
            // stack underflow case
            return -1;
        } else {

            return stack[top--];
        }

    }

    public int peek() {
        if (top == -1) {
            return -1;
        } else {
            return stack[top];
        }
    }

}
