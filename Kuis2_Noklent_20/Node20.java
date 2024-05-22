import org.w3c.dom.Node;

public class Node20 {
    Pembeli20 dataPembeli20;
    Node20 next20;
    Node20 prev20;
    Pesanan20 dataPesanan20;

    public Node20(Node20 prev20, Pembeli20 data20,Node20 next20) {
        this.dataPembeli20 = data20;
        this.next20 = next20;
        this.prev20 = prev20;
    }
    public Node20(Node20 prev20, Pesanan20 data20,Node20 next20) {
        this.dataPesanan20 = data20;
        this.next20 = next20;
        this.prev20 = prev20;
    }

    
}
