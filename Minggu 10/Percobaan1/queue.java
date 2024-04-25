package Percobaan1;

/**
 * praktikum1
 */
public class queue {
    int[] data;
    int front, rear, size, max;

    public queue(int n) {

        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    // isEmpty
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // peek
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);

        } else {
            System.out.println("Queue masih kosong");

        }
    }
 
    // print
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen: " + size);

        }
    }

    // clear
    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // enQueue push
    public void enQueue(int dt) {
        if (isFull()) {
            size++;
            System.out.println("Data size = "+ size +" dan max = "+ max);
            System.out.println("Queue Sudah lebih dari penuh dan tidak dapat diisi lagi . selamat tinggal");
            System.exit(0);

        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    // deQueue pop
    public int deQueue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Data size = "+ size--);
            System.out.println("Queue masih kosong dan tidak dapat dipeek Dan Selamat Tinggal");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}