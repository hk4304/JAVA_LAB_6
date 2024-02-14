// Fixed_stk.java

package ASS_6_part_1;

public class Fixed_stk implements Interface_STK {
    private static final int STACK_SIZE = 5;
    private int stack[] = new int[STACK_SIZE];
    private int top = -1;

    @Override
    public void push(int element) {
        if (overflow()) {
            System.out.println("Fixed Stack is full");
        } else {
            stack[++top] = element;
        }
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Fixed Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    @Override
    public void displayStack() {
        if (underflow()) {
            System.out.println("Fixed Stack is empty");
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    @Override
    public boolean overflow() {
        return top == (stack.length - 1);
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}
