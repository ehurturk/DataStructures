public class Queue<T> {
    private Node<T> front;
    private Node<T> end;

    public T Dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return null;
        }

        T val = front.value;
        front = front.next;
        return val;

    }

    public T Enqueue(T data) {
        Node<T> node = new Node<T>(data);
        if (front == null) {
            front = node;
            end = node;
        } else {
            Node<T> temp = end;
            temp.next = node;
            end = node;
        }
        return end.value;
    }

    public void Traverse() {
        if (front == null) {
            System.out.println("Empty Queue!");
        } else {
            Node<T> temp = front;
            while (temp.next != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
            System.out.println(temp.value);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.Enqueue(10);
        queue.Enqueue(5);
        queue.Enqueue(8);
        queue.Enqueue(7);
        queue.Dequeue();
        queue.Traverse();
    }
}
