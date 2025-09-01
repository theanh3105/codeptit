import java.util.*;
public class J03032 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
        String s = sc.nextLine().trim();
        StringBuilder sb = new StringBuilder();
        String[] a = s.split("\\s+");
        for (String x : a){
            sb.append (new StringBuilder(x).reverse())
            .append(" ");
        }                                                                                                   
        System.out.println(sb.toString());
    } sc.close();
    }
    
}
