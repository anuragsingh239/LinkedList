public class InsertAtBegning {
    public static Node insertAtBegning(Node head,int d){
        Node temp=new Node(d);
        temp.next=head;
        head=temp;
        return head;
    }

    public static void main(String[] args) {
        Node head=null;
        head=insertAtBegning(head,10);
        head=insertAtBegning(head,20);
        head=insertAtBegning(head,30);
//        System.out.println(head.data);
        print(head);

    }
    public static void print(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
}