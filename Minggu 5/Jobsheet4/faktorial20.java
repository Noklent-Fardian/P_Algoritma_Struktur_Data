package Jobsheet4;
public class faktorial20 {
    int nilai;

     public int faktorialBF20(int n ){
        int faktor = 1;
        for (int i = 1; i <= nilai; i++) {
            faktor = faktor * i;
        }
        return faktor;

    }
    public int faktorialDC20(int n){
        if (n==1) {
            return 1;
        } else {
            int faktor = n * faktorialDC20(n-1);
            return faktor;
        }
    }

    
}