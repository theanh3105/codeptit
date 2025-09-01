import java.util.*;
public class J03024 {
    public static String check(String s){
        if (s.charAt(0) == '0'){
            return "INVALID";
        }
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                return "INVALID";
            }
        }
        int even = 0;
        int odd = 0;
        for (int i = 0 ; i < s.length() ; i++){
            char so = s.charAt(i);
            if ((so - '0') % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        if (even > odd && (even + odd) % 2 == 0){
            return "YES";
        } else if (odd > even && (odd + even) % 2 != 0){
            return "YES";
        }
        return "NO";
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine().trim();
            System.out.println(check(s));
        }
    }
}