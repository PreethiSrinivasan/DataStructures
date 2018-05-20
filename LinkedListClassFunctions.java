public class LinkedListClassFunctions
{
    private Node head;

    //insert at head
    public void insertAtHead(int data)
    {
          Node newNode=new Node(data);
          newNode.setnextNode(this.head);
          this.head=newNode;
    }

    //length of linkedlist
    public int lengthLinkedList()
    {
        int length=0;
        Node current=this.head;
        while(current!=null)
        {
            current=current.getnextNode();
            length++;
        }
        return length;
    }

    //deleting a node from head

    public void deleteNodeAtHead()
    {
        this.head=this.head.getnextNode();

    }

    public static void main(String[] args)
    {
        LinkedListClassFunctions list=new LinkedListClassFunctions();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        System.out.println(list);
        System.out.println("length of the linkedlist is:" + list.lengthLinkedList());
        System.out.println(list.deleteNodeAtHead);
    }

    @Override
    public String toString()
    {
        String result= "{";
        Node current=this.head;
        while(current!=null)
        {
            result +=current.toString() + ",";
            current=current.getNext();
        }
        result +="}";
        return result;
    }
}