public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("satck is full, stack overflow");
            return;
        }
        stack[++top] = data;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("satck is empty, stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println();
            System.out.println("|"+stack[i]+"|" + " ");
            System.out.println("____");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top Element: " + stack.peek());
    }
   
}
