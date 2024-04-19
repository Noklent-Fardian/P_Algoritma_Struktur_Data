package Percobaan2;

public class StackKonversi20 {
    int size,top;
    int[] tumpukanBiner;

    public StackKonversi20(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size - 1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack Penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
