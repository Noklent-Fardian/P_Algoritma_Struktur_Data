package Joobshet3.Latihan1;

public class Kerucut  {
    public int r;
    public int s;

    public Kerucut(int r, int s){
        this.r = r;
        this.s = s;
    }

    public double hitungLuas(int r, int s){
        return Math.PI * r * (r + s);
    }
    public double hitungVolume(int r, int s){
        return (Math.PI * r * r * s) / 3;
    }
}
