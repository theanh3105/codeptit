import java.util.*;
public class J03025 {
    public static boolean check (String s){
        int count = 0;
        for (int i = 0 ; i < s.length()/2 ; i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                count ++;
            }
        }
        if (count == 1) {
            return true;
        }
        if (count == 0 && s.length() % 2 == 1){
            return true;
        }
        return false;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            if (check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}