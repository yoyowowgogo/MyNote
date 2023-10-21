package linked_list;

public class TestDemo {
    public static void main(String[] args)
    {
        Node node1=new Node(1,"1");
        Node node2=new Node(4,"4");
        Node node3=new Node(3,"3");
        Node node4=new Node(2,"2");
        Node node5=new Node(5,"5");

        MyLinkedList linkedlist=new MyLinkedList();
        linkedlist.add(node1);
        linkedlist.add(node2);
        linkedlist.add(node3);
        linkedlist.add(node4);
        linkedlist.add(node5);

        linkedlist.addByOrder(node1);
        linkedlist.addByOrder(node2);
        linkedlist.addByOrder(node3);
        linkedlist.addByOrder(node4);
        linkedlist.addByOrder(node5);

        linkedlist.print();

        Node newNode=new Node(4,"3");
        linkedlist.update(newNode);
        linkedlist.print();
        System.out.println("---");
        linkedlist.reverse();
        System.out.println("---");
        linkedlist.print();
    }
}
