package P2;

public class SLIMain {
    public static void main(String[] args) {
        singleLinkedList singLL=new singleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("=====================================");
        System.out.println("Data Pada index ke 1="+singLL.getData(1));
        System.out.println("Data Pada index ke 3="+singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
    
}
