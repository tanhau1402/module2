package circular_queue;

public class Solution {
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }

    static void enQueue(Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.print("Queue is empty");
            return Integer.MIN_VALUE;
        }


        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }

        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.print(
                "\nElements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;
        enQueue(queue, 12);
        enQueue(queue, 45);
        enQueue(queue, 33);
        displayQueue(queue);
    }
}

