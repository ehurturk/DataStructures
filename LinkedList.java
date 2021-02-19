package apCSExercies;

public class LinkedList {

    public Node head;

    public void Traverse() {
        
        
        if (head == null) {
            return;
        }
        else {
            Node temp = head;

            while(temp.next != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
            System.out.println(temp.value);
        
        }

    }

    public LinkedList Insert(Node node) {
        
      if (head == null) {
          head = node;
      }

      else {
          
          Node iterNode = head;
          while(iterNode.next != null) {
              iterNode = iterNode.next;
          }
          
          iterNode.next = node;
      }

      return this;

    }

    public LinkedList Delete(Node node) {
        if (head == null) {
           head = node;
           return this;
        }

        Node tempNode = head;
        while(tempNode.next == node) {
        
          tempNode = tempNode.next;
        }

        // the loop would get to the (n-1)'th node, if we say the desired node is n. Therefore, we need to get the 'next' of the tempNode
        tempNode.next = tempNode.next.next;
        
        return this;
    }

    

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        
        list.Insert(new Node(10));
        list.Insert(new Node(5));
        list.Insert(new Node(8));
        list.Insert(new Node(7));
        list.Insert(new Node(9));
        list.Insert(new Node(1));
        
        System.out.println("LinkedList before deletion: ");
        list.Traverse();
        System.out.println("\nLinkedList after deletion: ");
        list.Delete(new Node(5));

        list.Traverse();


    }
}
