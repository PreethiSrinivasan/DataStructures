public class LinkedListClassFunctions
{
    private Node head;
    public void insertAtHead(int data)
    {
          Node newNode=new Node(data);
          newNode.setnextNode(this.head);
          this.head=newNode;
    }


    public static void main(String[] args)
    {
        LinkedListClassFunctions list=new LinkedListClassFunctions();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        System.out.println(list);
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