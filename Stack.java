
public class Stack<T> {
    
    private Node<T> top;
    private Node<T> temp;
    private Node<T> head;

   
    public Stack<T> push(T data) {
        Node<T> node = new Node<T>(data);
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
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! ");
        }

        else {
            temp.next = null;
            top = temp;
        }
    }

    public Stack<T> traverse() {
        Node<T> t = head;
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

    public T peek() {
        if (top == null) {
            return null;
        } else {
            return top.value;
        }
    }
    


    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<Integer>();
        // stack.push(10);
        // stack.push(5);
        // stack.push(8);
        // stack.push(7);
        // stack.push(9);
        // stack.pop();
        // stack.pop();
        // stack.traverse();
        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Guys!");
        stack.pop();
        stack.traverse();
        System.out.println("Peek is: " + stack.peek());
    }
}

