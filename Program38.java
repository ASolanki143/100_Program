public class Program38 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        // head.next.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.println("Before Insertion");
        printList(head);
        head = insert(head,3 );
        System.out.println("After Insertion");
        printList(head);
    }

    public static Node insert(Node head, int data){
        Node newNode = new Node(data);
        if(head == null) return newNode;
        if(head.data > data){
            newNode.next = head;
            return newNode;
        }

        Node curr = head;
        while(curr.next != null && curr.next.data < data){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;

    }

    public static void printList(Node head){
        Node curr = head;
        while(curr.next != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
}

class Node{
    int data;
    Node next;

    public Node(){
        this.data = 0;
        this.next = null;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
