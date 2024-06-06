package Percobaan1;

import org.w3c.dom.Node;

public class DoubleLinkedList20 {
    Node20 head;
    int size;

    public DoubleLinkedList20() {
        head = null;
        int size = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node20(null, item, jarak, null);
        } else {
            Node20 newNode20 = new Node20(null, item, jarak, head);
            head.prev = newNode20;
            head = newNode20;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node20 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    public int getData(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node20 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node20 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, Tidak Dapat Dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, Tidak Dapat Dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node20 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        Node20 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev == null) {
                    head = current.next;
                    current.next.prev = null;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.prev.next = current.prev;
                }
                break;
            }
            current = current.next;

        }
    }

}
