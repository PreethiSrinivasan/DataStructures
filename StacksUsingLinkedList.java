public class Node{
    int data;
    Node next;
    Node(int key)
    {
        data=key;
        next=null;
    }   
}


public class Stack{
    private LinkedList listObj;
    public Stack()
    {

        listObj=new LinkedList();
    }
    public void push(int i)
    {
        listObj.insert(i);
    }
    public void pop()
    {
        listObj.delete();
    }


}

public class LinkedList{
    Node head;
    LinkedList()
    {
        head=null;
    }

    void insert(int i)
    {
        Node newNode=new Node(i);
        newNode.next=head;
        head=newNode;
    }

    public Node delete()
    {
        Node temp;
        temp=head;
        head=head.next;
        return temp;
    }

}
public class main{
    public static void main(String args[])
    {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.pop();
    }
}