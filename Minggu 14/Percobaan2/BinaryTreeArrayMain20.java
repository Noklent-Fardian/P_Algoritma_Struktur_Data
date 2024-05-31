package Percobaan2;

public class BinaryTreeArrayMain20 {
    public static void main(String[] args) {

        BinaryTreeArray20 bta = new BinaryTreeArray20();
        int data[] = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\n InOrder Traversal: ");
        bta.traverseInOrder(0);
        System.out.println();
    }
}
