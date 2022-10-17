public class LinkedList {
 
    public class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            next.data=data;
        }
    }
    public static void Transverse(Node head)
    {
        Node cur =head;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node n1 =linkedList.new Node(10);
        Node n2 =linkedList.new Node(20);
        Node n3 =linkedList.new Node(30);
        Node head = n1;
        head.next= n2;
        n2.next=n3;
        n3.next=null;
        Transverse(head);
    }
}
