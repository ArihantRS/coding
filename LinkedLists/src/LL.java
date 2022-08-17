public class LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
          this.data = data;
            next = null;
        }
    }

    Node head;

    public Node InsertAtBeg(int d) {

        Node nd = new Node(d);
        if(head==null)
        {head=nd;}
        else{
        nd.next = head;
        head = nd;}
        return head;
    }

    public void InsertAfter(int d, Node prev) {
        Node nd = new Node(d);
        nd.next = prev.next;
        prev.next = nd;
    }

    public void InsertAtEnd(int d) {
        Node nd = new Node(d);
        if (head == null) {
            head = nd;
        } else {
            nd.next = null;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nd;
        }
    }

    public void delete(int d) {
        Node temp = head, prev = null;
        while (temp.data != d) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
    public void Print(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);

    }

    public static void main(String[] args) {
       Node l1,l2;
      //LL.Node n1=new Node(2);
       LL ob=new LL();
       l1=ob.InsertAtBeg(1);
        l2=ob.InsertAtBeg(0);
     ob.InsertAfter(2,l1);
     ob.InsertAfter(7,l2);
     ob.InsertAtEnd(69);
        ob.Print();
        ob.delete(7);
        ob.Print();
    }
}