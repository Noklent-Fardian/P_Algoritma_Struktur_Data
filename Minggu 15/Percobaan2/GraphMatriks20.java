package Percobaan2;

public class GraphMatriks20 {
    int vertex;
    int[][] matriks;

    public GraphMatriks20(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEgde(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }
    public void removeEgde(int asal, int tujuan){
        matriks[asal][tujuan] = -1;
    }
    public void printGraph(){
        for (int i=0;i<vertex;i++){
            System.out.print("Gedung"+(char)('A'+i)+": ");
            for (int j=0;j<vertex;j++){
                if (matriks[i][j] != -1){
                    System.out.print("Gedung"+(char)('A'+j)+"("+matriks[i][j]+"m), ");
                }
            }
            System.out.println();
        }
       
    }

    public void sumDegree(){
        int k, total,total1;
        //indegree
        for (int i=0;i<vertex;i++){
            total = 0;
            total1 = 0;
            //indegree
            for (int j=0;j<vertex;j++){
                if (matriks[j][i] != 0){
                    total++;
                }
            }
            //outdegree
            for (int j=0;j<vertex;j++){
                if (matriks[i][j] != 0){
                    total1++;
                }
            }
            System.out.println("Indegree Gedung "+(char)('A'+i)+"  : "+total);
            System.out.println("Outdegree Gedung "+(char)('A'+i)+" : "+total1);
        }
    }
    
}
