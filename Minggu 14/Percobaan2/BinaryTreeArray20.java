package Percobaan2;

public class BinaryTreeArray20 {
    int data [];
    int idxlast;

    public BinaryTreeArray20(int data[]) {
        this.data = data;
        idxlast = data.length - 1;
    }
    public BinaryTreeArray20(){
        data = new int[10];
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxlast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxlast){
           
            traverseInOrder(2*idxStart+1);
           
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);

        }
    }
}
