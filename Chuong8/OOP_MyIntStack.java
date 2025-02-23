package bai8;

public class OOP_MyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5);

        for (int i = 1; i <= 7; i++) {
            stack.push(i);
            System.out.println("Pushed: " + i);
        }

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
