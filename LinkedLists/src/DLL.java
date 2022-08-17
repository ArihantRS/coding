class Node{
    int data;
    Node next;
    Node prev;

    Node(int d){
        data=d;
        prev=null;
        next=null;
    }
}

public class DLL {
    Node head;
    void insertAtEnd(int d){
        Node nd=new Node(d);
        if(head==null)
            head=nd;
        else
        {
            nd.next=null;
            Node temp=head;//prev=null;
            while(temp.next!=null)
            {
                //prev=temp;
                temp=temp.next;
            }
            nd.prev=temp;
            temp.next=nd;
        }
    }
    public Node InsertAtBeg(int d) {

        Node nd = new Node(d);
        if(head==null)
            head=nd;
        else{
            nd.next=head;
            head.prev=nd;
            head=nd;
        }
        return head;
    }

}
