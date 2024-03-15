package Jobsheet4.Percobaan3;

public class Sum {
    int element;
    double keuntungan[], total;

    Sum(int element){
        this.element = element;
        this.keuntungan = new double[this.element];
        this.total = 0;
    }

    double totalBf(double arr[]){
        for (int i = 0; i < element; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[],int l,int r){
        if (l == r) {
            return arr[l];
        }
        else if (l < r) {
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum + arr[mid] + rsum;
        }
        return 0;
    }

}

