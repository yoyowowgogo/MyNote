package linked_list;


import java.util.Stack;
class Node
{
    int data;
    Node next;
    String name;
    public Node(int data,String name)
    {
        this.data=data;
        this.name=name;
    }
    public String toString()
    {
        return "Node{data="+data+", name='"+name+"\'}";
    }
}
public class MyLinkedList {
    private Node head=new Node(0,"");

    public int length()
    {
        int size=0;
        Node p=head.next;
        while(p!=null)
        {
            p=p.next;
            size++;
        }
        return size;
    }

    public void add(Node node)
    {
        if(head.next==null)
        {
           head.next=node;
           node.next=null;
           return;
        }

        Node p=head.next;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=node;
        node.next=null;
    }
    public void addByOrder(Node node)
    {
        if(head.next==null)
        {
            head.next=node;
            node.next=null;
            return;
        }
        Node p=head.next;
        while(p.next!=null&&p.next.data<=node.data)
        {
            p=p.next;
        }
        if(p.next!=null)
        {
            Node t=p.next;
            p.next=node;
            node.next=t;
        }
        else
        {
            p.next=node;
            node.next=null;
        }
    }
    public void delete(int data)
    {
        if(head.next==null)
            return;
        Node p=head.next;
        boolean exist=false;
        Node pre=head;
        while(p!=null)
        {
            if(p.data==data)
            {
                exist=true;
                break;
            }
            pre=p;
            p=p.next;
        }
        if(exist==true)
        {
            pre.next=p.next;
        }
    }
    public void update(Node node)
    {
        if(head.next==null)
            return;
        Node p=head.next;
        while(p!=null)
        {
            if(p.data==node.data)
            {
                p.name=node.name;
                return;
            }
            p=p.next;
        }
    }
    public Node search(String name)
    {
        if(head.next==null)
            return null;
        Node p=head.next;
        while(p!=null)
        {
            if(p.name==name)
            {
               return p;
            }
            p=p.next;
        }
        return null;
    }
    public Node findLastKNode(int k)
    {
        if(head.next==null)
            return null;

        int size=length();
        if(k>size)
        {
            return null;
        }
        Node p=head.next;
        for(int i=0;i<size-k;i++)
        {
            p=p.next;
        }
        return p;
    }
    public void reverse()
    {
        if(head==null)
            return;
        Node pre=null;
        Node cur=head.next;
        Node follow;
        while(cur!=null)
        {
            follow=cur.next;
            cur.next=pre;
            pre=cur;
            cur=follow;
        }
        head.next=pre;
    }
    public void print()
    {
        if(head.next==null)
        {
            System.out.println("链表为空");
            return;
        }
        else
        {
            Node p=head.next;
            while(p!=null)
            {
                System.out.println(p);
                p=p.next;
            }
        }
    }
    public void reversePrint()
    {
        Stack<Node> s=new Stack<>();
        Node p=head.next;
        while(p!=null)
        {
            s.push(p);
            p=p.next;
        }
        while(!s.empty())
        {
            p=s.pop();
            System.out.println(p);
        }
    }
}
