package apCSExercies;

public class Stack {
    
    private Node top;
    private Node temp;
    private Node head;
    
    public Stack push(int data) {
        Node node = new Node(data);
        if (top == null) {
            head = node;
            top = head;
        } else {
            // top.next will always be null !!!!
            temp = top;
            temp.next = node;
            top = node;
        }
        return this;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! ");
            return -1;
        }

        else {
            temp.next = null;
            top = temp;
            return top.value;
        }
    }
    
    public Stack traverse() {
        Node t = head;
        while (t.next != null) {
            System.out.println(t.value);
            t = t.next;
        }
        System.out.println(t.value);
        
        return this;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int peek() {
        if (top == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return top.value;
        }
    }

   
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.traverse();
        System.out.println("Peek is: " + stack.peek());
    }
}

