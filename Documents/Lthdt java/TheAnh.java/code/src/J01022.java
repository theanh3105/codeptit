import java.util.*;
public class J01022 {
    public static String fibo (int n){
        String[] X = new String[n + 1];
        if (n == 1) return "0";
        if (n == 2) return "1";
        X[1] = "0";
        X[2] = "1";
        for (int i = 3; i <= n ; i++){
            X[i] = X[i - 2] + X[i - 1];
        }
        return X[n];
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            //int k = sc.nextInt();
            System.out.print (fibo(n));
        }
    }
}