package bai8;

public class MyIntStack {
    private int[] contents;
    private int tos;

    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public boolean push(int element) {
        if (isFull()) {
            resize();
        }
        contents[++tos] = element;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return contents[tos--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }

    private void resize() {
        int newSize = contents.length * 2;
        int[] newArray = new int[newSize];
        System.arraycopy(contents, 0, newArray, 0, contents.length);
        contents = newArray;
    }
}
