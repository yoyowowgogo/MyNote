package linked_list;
class DoubleNode
{
    public int data;
    public String name;
    public DoubleNode pre;
    public DoubleNode next;

    public DoubleNode(int data,String name)
    {
        this.data=data;
        this.name=name;
    }
    public String toString() {
        return "HeroNode{" +
                "data=" + data +
                ", name='" + name + '\'' +
                '}';
    }
}
public class DoubleLinkedList {
    private DoubleNode head=new DoubleNode(0,"");
    public void add(DoubleNode node)
    {
        if(head.next==null)
        {
            head.next=node;
            node.next=head;
            head.pre=node;
            node.pre=head;
            return;
        }
        DoubleNode p=head.next;
        while(p.next!=head)
        {
            p=p.next;
        }
        p.next=node;
        node.next=head;
        node.pre=p;
        head.pre=node;
    }

    public void addByOrder(DoubleNode node)
    {
        DoubleNode p=head.next;
        if(p==null)
        {
            head.next=node;
            head.pre=node;
            node.next=head;
            node.pre=head;
            return;
        }
        DoubleNode pre=head;

        while(p!=head)
        {
            if(p.data==node.data)
            {
                return;
            }
            if(p.data>node.data)
            {
                break;
            }
            pre=p;
            p=p.next;
        }
        pre.next=node;
        node.next=p;
        p.pre=node;
        node.pre=pre;

    }


    public void update(DoubleNode node)
    {
        if(head.next==null)
            return;
        DoubleNode p=head.next;
        while(p!=head)
        {
            if(p.data==node.data)
            {
                p.name=node.name;
                return;
            }
            p=p.next;
        }
    }
    public void delete(int data)
    {
        if(head.next==null)
        {
            return;
        }
        DoubleNode p=head.next;
        DoubleNode pre=head;
        boolean exist=false;
        while(p!=head)
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
            p.next.pre=pre;
        }
    }
    public void print()
    {
        if(head.next==null)
        {
            System.out.println("链表为空");
            return;
        }
        DoubleNode p=head.next;
        while(p!=head)
        {
            System.out.println(p);
            p=p.next;
        }
    }

}
