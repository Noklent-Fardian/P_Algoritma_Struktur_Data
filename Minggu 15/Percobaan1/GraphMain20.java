package Percobaan1;

import java.util.Scanner;

public class GraphMain20 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph20 gedung = new Graph20(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 2, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukan Gedung Asal : ");
      int asal = sc.nextInt();
        System.out.print("Masukan Gedung Tujuan : ");
       int tujuan = sc.nextInt();
        gedung.checkAdjacency(asal, tujuan);

        
        
    }
}
