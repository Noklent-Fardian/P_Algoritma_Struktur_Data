package Joobshet3.Latihan1;

public class LimasSegiEmpatSamaSisi extends BangunRuang{

    int t;
    int s;
    public LimasSegiEmpatSamaSisi(int t, int s){
        this.t = t;
        this.s = s;
    }

    public double hitungLuasPermukaan( int s){
        return s*s;
    }
    public double hitungVolume(int t, int s){
        return (s * s * t) / 3;
    }
    
}
