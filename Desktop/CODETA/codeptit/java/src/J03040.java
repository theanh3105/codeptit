import java.util.*;

public class J03040 {

    public static boolean check(String s){
        String k = s.replace("." ,"");
        char[] a = k.toCharArray();
        // chi co 8 va 6
        boolean only68 = true;
        for (int i = 0 ; i < 5 ;i++){
            if (a[i] != '8' && a[i] != '6'){
                only68 = false;
                break;
            }
        }
        if(only68) return true;
        // 5 so bang nhau
        boolean bangnhau = true;
        for (int i = 0 ; i < 5; i++){
            if (a[i] != a[0]){
                bangnhau = false;
                break;      
            }
        }
        if (bangnhau) return true;
        // 3 so dau va 2 so cuoi
        if (a[0] == a[1] && a[1] == a[2] && a[3] == a[4]){
            return true;
        }
        //tang dan 
        boolean tangdan = true;
        for (int i = 0 ; i < 4; i++){
            if (a[i] >= a[i + 1]){
                tangdan = false;
                break;
            }
        }
        if (tangdan) return true;
        return false;

    }
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0){
        String bienso = sc.nextLine();
        String sobien = bienso.substring(5);
        if (check(sobien)){
            System.out.println ("YES");
        } else {
            System.out.println ("NO");
        }
    
        }
        sc.close();
    }
}
