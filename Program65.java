public class Program65 {
    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);
        printList(l1);
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);
        printList(l2);
        Node l3 = new Program65().addTwoNumber(l1, l2);
        printList(l3);
    }

    public Node addTwoNumber(Node l1, Node l2){
        Node dummy = new Node();
        Node l3 = dummy;

        int carry = 0;

        while(l1 != null || l2 != null){
            int num1 = (l1 == null) ? 0 : l1.data;
            int num2 = (l2 == null) ? 0 : l2.data;

            int ans = num1 + num2 + carry;
            if(ans > 9){
                ans = ans % 10;
                carry = 1;
            }
            else{
                carry = 0;
            }

            Node node = new Node(ans);
            l3.next = node;
            l3 = node;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry == 1){
            l3.next = new Node(1);
        }

        return dummy.next;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
        System.out.println();
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
        this();
        this.data = data;
    }
}
