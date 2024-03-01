package Joobshet3.Latihan1;

public class Bola extends BangunRuang{
    int r;
    public Bola(int r){
        this.r = r;
    }

    public double hitungLuas(int r){
        return  Math.PI * r * r;
    }

    public double hitungVolume(int r){
        return (4 * Math.PI * r * r * r) / 3;
    }
    
}
