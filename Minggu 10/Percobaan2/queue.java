package Percobaan2;

/**
 * praktikum1
 */
public class queue {
    Nasabah[] data;
    int front, rear, size, max;

    public queue(int n) {

        max = n;
        data = new Nasabah[max];
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
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");

        }
    }
    //peekrear /tail
    public void peekrear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama + " "
                    + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
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
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                        + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                    + data[i].saldo);
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
    public void enQueue(Nasabah dt) {
        if (isFull()) {
            System.out.println("Data size = " + size + " dan max = " + max);
            System.out.println("Queue Sudah lebih dari penuh dan tidak dapat diisi lagi . selamat tinggal");
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
    public Nasabah deQueue() {
        Nasabah dt = new Nasabah();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
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