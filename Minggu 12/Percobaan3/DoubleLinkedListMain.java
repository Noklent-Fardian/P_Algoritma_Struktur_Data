package Percobaan3;

public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================");
        dll.Add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================");
        System.out.println("Data Awal Pada Linked List adalah :"+dll.getFirst());
        System.out.println("Data Akhir Pada Linked List adalah :"+dll.getLast());
        System.out.println("Data Index ke-1 Pada Linked List adalah :"+dll.get(1));


    }
    
}
