package Percobaan1;

public class Graph20 {
    int vertex;
    DoubleLinkedList20 list[];

    public Graph20(int v) {
        vertex = v;
        list = new DoubleLinkedList20[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList20();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        /********************************
         * undirected graph
         * list[tujuan].addFirst(asal, jarak);
         */

    }

    public void degree(int asal) throws Exception {
        int k, totalLin = 0, TotalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // indegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].getJarak(j) == asal) {
                    ++totalLin;
                }
            }
            // outdegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].getJarak(k);
            }
            TotalOut = k;
        }
        System.out.println("Indegree dari Gedung " + (char) (asal + 'A') + " : " + totalLin);
        System.out.println("Outdegree dari Gedung " + (char) (asal + 'A') + " : " + TotalOut);
        System.out.println("degree dari Gedung " + (char) (asal + 'A') + " : " + (totalLin + TotalOut));
        /*
         * undirected graph
         * System.out.println("Degree dari gedung" +
         * (char)(asal+'A')+" : "+(totalLin+TotalOut));
         */
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Semua Graf Telah dihapus");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) (i + 'A') + " Terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].getData(j)) + "(" + list[i].getJarak(j) + "m),");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void checkAdjacency(int asal, int tujuan) throws Exception {
        boolean status = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (tujuan == list[asal].getData(i)) {
                status = true;
                break;
            }
        }
        if (status) {
            System.out.println("Gedung " + (char)('A'+asal) + " Terhubung dengan Gedung " +  (char)('A'+tujuan));
        } else {
            System.out.println("Gedung " + (char)('A'+asal) + " Tidak Terhubung dengan Gedung " +  (char)('A'+tujuan));
        }
    }}
