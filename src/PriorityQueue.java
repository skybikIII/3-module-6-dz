import java.util.Arrays;

public class PriorityQueue {
    int SIZE = 5;
    int[] items = new int[SIZE];
    int front;
    int rear;

    PriorityQueue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if(front == 0 && rear == SIZE - 1)
            return true;
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        return false;
    }

    void enQueue(int element) {
        int temp = 0;
        if(isFull())
            System.out.println("������� ���������!");
        else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("�������� ������� " + element);
        }
    }

    void sort() {
        Arrays.sort(items);
    }
    int deQueue() {
        int temp = 0;
        if (isEmpty())
            System.out.println("������� ������");
        else {
            temp = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else
                front++;
            System.out.println("������ ������� -> " + temp);

        }
        return temp;
    }

    void display() {
        int i;
        if(isEmpty())
            System.out.println("������ �������");
        else {
            System.out.println("\n������ FRONT -> " + front);
            System.out.println("�������� -> ");
            for(i = front; i <= rear; i++) {
                sort();
                System.out.print(items[i] + " ");
            }
            System.out.println("\n������ REAR -> " + rear);
        }
    }

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.enQueue(5);
        q.enQueue(8);
        q.enQueue(123);
        q.enQueue(2);
        q.enQueue(10);
        q.deQueue();
        q.deQueue();
        q.display();
    }
}
