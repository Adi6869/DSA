class Node  //Defining the Class
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class SLL
{
    Node head;
    public void InsertatBegin(int data)  //Insert element at beginning
    {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void InsertatEnd(int data)
    {
        Node node = new Node(data);
        if (head == null)
        {
            head = node;
            return;
        }
        Node curr = head;
        while (curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = node;
    }
}

