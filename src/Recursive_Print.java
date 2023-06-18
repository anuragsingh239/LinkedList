
public class Recursive_Print {
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
        if(head==null){
            return;
        }
        System.out.println(head.data+" ");
        print(head.next);
    }
}
