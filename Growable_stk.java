// Growable_stk.java

package ASS_6_part_1;

import java.util.ArrayList;

public class Growable_stk implements Interface_STK {
    private ArrayList<Integer> stack = new ArrayList<>();
    private int top = -1;

    @Override
    public void push(int element) {
        stack.add(++top, element);
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Growable Stack is empty");
            return -1;
        } else {
            int element = stack.get(top);
            stack.remove(top--);
            return element;
        }
    }

    @Override
    public void displayStack() {
        for (int x : stack) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    @Override
    public boolean overflow() {
        return false; // Not applicable for growable stack
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}
