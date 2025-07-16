package Queue;

class queue {

    int[] a = new int[5];
    int front = -1;
    int rear = -1;

    // enqueue method 
    public void enqueue(int data) {
        if (rear == a.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        a[rear] = data;
    }

    // dequeue 
    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted elements :" + a[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
        }
        front++;
    }

    // display
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        }
        System.out.println("Queue elements");
        for (int i = front; i <= rear; i++) {
            System.out.println(a[i]);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        queue operations = new queue();
        operations.enqueue(10);
        operations.enqueue(20);
        operations.enqueue(30);
        operations.enqueue(40);
        operations.enqueue(50);

        operations.dequeue();
        operations.display();

    }
}
