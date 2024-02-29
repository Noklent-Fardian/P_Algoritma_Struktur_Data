package Joobshet3.ArraySegitiga;

public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    int hitungLuas(int alas, int tinggi){
        return (alas * tinggi) / 2;
    }
    int hitungKeliling(int alas, int tinggi){
        return alas + tinggi+ (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
}
