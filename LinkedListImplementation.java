public class Node
{
    private int data;
    private Node nextNode;

    public Node(int data)
    {
        this.data=data;
    }

    public void getData()
    {
        return this.data;
    }
    public void getnextNode()
    {
        return this.nextNode;
    }
    public int setData(int data)
    {
        this.data=data;
    }
    public Node setnextNode(Node nextNode)
    {
        this.nextNode=nextNode;
    }
}