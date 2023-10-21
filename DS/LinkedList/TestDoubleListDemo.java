package linked_list;

public class TestDoubleListDemo {
    DoubleLinkedList doubleList;
    public void before()
    {
        DoubleNode node1=new DoubleNode(1,"1");
        DoubleNode node2=new DoubleNode(2,"2");
        DoubleNode node3=new DoubleNode(3,"3");
        DoubleNode node4=new DoubleNode(4,"4");

        doubleList=new DoubleLinkedList();
        doubleList.addByOrder(node1);
        doubleList.addByOrder(node3);
        doubleList.addByOrder(node2);
        doubleList.addByOrder(node4);
    }

    public void addTest()
    {

    }

    public void updateTest()
    {
        System.out.println("更新前");
        doubleList.print();
        DoubleNode node=new DoubleNode(4,"3");
        doubleList.update(node);
        System.out.println("更新后");
        doubleList.print();
    }

    public void deleteTest()
    {
        System.out.println("删除前");
        doubleList.print();
        doubleList.delete(1);
        doubleList.delete(4);
        doubleList.delete(3);
        System.out.println("删除后");
        doubleList.print();
    }
    public static void main(String[] args)
    {
        TestDoubleListDemo t=new TestDoubleListDemo();
        t.before();
        t.updateTest();
        t.deleteTest();

    }

}
