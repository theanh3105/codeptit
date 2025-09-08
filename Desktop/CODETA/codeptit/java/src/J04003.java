import java.util.*;
class PhanSo {
    private long a; 
    private long b;
    public PhanSo(){

    }
    public PhanSo (long a, long b){
        this.a = a;
        this.b = b;
    }
    public long getA (){
        return a / gcd (a, b); 
    }
    public long getB (){
        return b / gcd (a, b);
    }
    public long gcd (long a, long b){
        if (b == 0) return a;
        return gcd (b , a % b);
    }
}

public class J04003 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo ps = new PhanSo(a , b);
        System.out.print (ps.getA() + "/" + ps.getB());
    }
}
