package P1;

import org.w3c.dom.Node;

public class singleLinkedList {
    node head, tail;

    boolean isEmpty() {
        return head != null;
    }

    void print() {
        if (isEmpty()) {
            node temp = head;
            System.out.print("Isi linked list: \t");
            while (temp != null) {
                System.out.print(temp.data + " \t");
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
            
        }
    }
    void addLast(int input){
        node ndInput = new node(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        }else{
            head = ndInput;
            tail = ndInput;
        }
    }

    void addFirst(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            ndInput.next=head;
            head = ndInput;
            
        }else{
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key,int input){
        node ndInput = new node(input, null);
        node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp != null) {
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }
    void insertAt(int index, int input){
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
            
        }
    }
}
