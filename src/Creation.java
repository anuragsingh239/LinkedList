class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class Creation {
    Node head;

    public static void main(String[] args) {
        Node head=new Node(10);
        Node data2=new Node(20);
        Node data3=new Node(30);
        head.next=data2;
        data2.next=data3;
        print(head);
    }
    public static void print(Node head){
        Node current=head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}
