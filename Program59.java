public class Program59 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.rptr = new Node(2);
        head.rptr.rptr = new Node(4);
        head.rptr.lptr = head;
        head.rptr.rptr.rptr = new Node(5);
        head.rptr.rptr.lptr = head.rptr;
        
        System.out.println("Before Insertion");
        printList(head);

        Node[] result = split(head);
        System.out.println("After Splitting");
        System.out.println("Even List:");
        printList(result[0]);
        System.out.println("Odd List:");
        printList(result[1]);
    }

    public static Node[] split(Node head){
        Node evenHead = new Node();
        Node oddHead = new Node();

        Node even = evenHead;
        Node odd = oddHead;
        
        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.data);
            if(curr.data % 2 == 0){
                even.rptr = newNode;
                newNode.lptr = even;
                even = newNode;
            }
            else{
                odd.rptr = newNode;
                newNode.lptr = odd;
                odd = newNode;
            }
            curr = curr.rptr;
        }

        return new Node[]{evenHead.rptr, oddHead.rptr};
    }
    

    public static void printList(Node head){
        Node curr = head;
        while(curr.rptr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.rptr;
        }
        System.out.println(curr.data);
    }
}

class Node{
    int data;
    Node lptr, rptr;

    public Node(){
        this.data = 0;
        this.lptr = null;
        this.rptr = null;
    }
    public Node(int data){
        this.data = data;
        this.lptr = null;
        this.rptr = null;
    }
}
