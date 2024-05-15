package P2;

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

    void addLast(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void addFirst(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            ndInput.next = head;
            head = ndInput;

        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
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

    void insertAt(int index, int input) {
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

    int getData(int index) {
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int indexOf(int key) {
        node temp = head;
        int index = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong Tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong Tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong Tidak bisa dihapus");
        } else {
            node temp = head;
            while (temp != null && temp.data != key) {
                temp = temp.next;
                if (temp.data != key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
            }
            temp = temp.next;
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }

        }
    }
}
