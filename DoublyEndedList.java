public class DoublyEndedList
{
    private Node head;
    private Node tail;

    public void insertAtTail(int data)
    {
        Node newNode=new newNode(data);
        if(this.head=null)
        {
            this.head=newNode;
        }
          if(this.tail!=null)
          {
              this.tail.setNextNode(newNode);
              this.tail=newNode;

          }
    }
    @Override
    public String toString()
    {
        String result="{";
        Node current=this.head;
        while(current!=null)
        {
            result+=current.toString()+",";
            current=current.getnextNode();
        }
        result+="}";
        return result;
    }

    public static void main(String args[])
    {
        DoublyEndedList ddl=new DoublyEndedList();
        ddl.insertAtTail(19);
        ddl.insertAtTail(20);
        System.out.println(ddl);
    }
    


}