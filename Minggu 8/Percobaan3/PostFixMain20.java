package Percobaan3;

import java.util.Scanner;

public class PostFixMain20 {
    public static void main(String[] args) {
        
        Scanner input20 = new Scanner(System.in);
        String  P,Q;
        System.out.println("Masukan Expresi Matematika (infix) : ");
        Q = input20.nextLine();
        Q=Q.trim();
        Q= Q+")";
        int total = Q.length();
        PostFix20 post = new PostFix20(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
}
