package Latihan;

public class queue {
    pembeli[] antrian;
    int front, rear, size, max;

    public queue(int n) {

        max = n;
        antrian = new pembeli[max];
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

    //enqueue
    public void enqueue(pembeli data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = data;
            size++;
        }
    }
    
    //dequeue
    public pembeli dequeue() {
        pembeli temp = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            temp = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return temp;
    }

    //print
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + antrian[i].nama + " No HP: " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Nama: " + antrian[i].nama + " No HP: " + antrian[i].noHP);
            System.out.println("Jumlah elemen: " + size);

        }
    }

    //peek
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHP);

        } else {
            System.out.println("Antrian masih kosong");

        }
    }

    //peekRear
    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear].nama + " " + antrian[rear].noHP);

        } else {
            System.out.println("Antrian masih kosong");

        }
    }

    //peekPosition
    public void peekPosition(String nama) {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Elemen ditemukan pada posisi: " + i);
                    break;
                }
                i = (i + 1) % max;
            }
            if (antrian[i].nama.equals(nama)) {
                System.out.println("Elemen ditemukan pada posisi: " + i);
            } else {
                System.out.println("Elemen tidak ditemukan");
            }

        } else {
            System.out.println("Antrian masih kosong");

        }
    }

    //daftarPembeli
    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama);
        }
    }
}
