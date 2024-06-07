package Percobaan2;

public class GraphMain20 {
    public static void main(String[] args) {
        GraphMatriks20 gdg =new GraphMatriks20(4);
        gdg.makeEgde(0, 1, 50);
        gdg.makeEgde(1,0,60);
        gdg.makeEgde(1,2,70);
        gdg.makeEgde(2,1,80);
        gdg.makeEgde(2,3,40);
        gdg.makeEgde(3,0,90);
        gdg.printGraph();
        System.out.println("Hasil Setelah Penghapusan Edge");
        gdg.removeEgde(2,1);
        gdg.printGraph();
        gdg.sumDegree();
    }
}
