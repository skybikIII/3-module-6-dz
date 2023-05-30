public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (isFull())
            System.out.println("Стек заполнен!");
        else {
            System.out.println("Добавлен элемент!");
            arr[++top] = x;
        }
    }

    public int pop() {
        if (isEmpty())
            System.out.println("Пустой стек!");
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(12);
        stack.push(122);
        stack.push(2);
        stack.push(1002);
        stack.pop();
        stack.printStack();
    }
}
