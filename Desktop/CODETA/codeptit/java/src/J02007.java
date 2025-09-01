import java.util.*;
public class J02007 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (int j = 1 ; j <= t ; j++){
            int n = sc.nextInt();
            int[] a = new int [n];
            for (int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int x : a){
                map.put(x , map.getOrDefault(x , 0) + 1);
            }
            System.out.println ("Test " + j +":");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println (entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}