import java.util.*;
public class J01010 {
    public static String check(String s){
        String a = "";
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == '0' || c == '8' || c == '9'){
                c = '0';
                a += c;
            } else if (c == '1'){
                c = '1';
                a += c;
            } else {
                return "INVALID";
            }
        }
        for (int i = 0 ; i < a.length() ; i++){
            if (a.indexOf('1') == -1){
                return "INVALID";
            }
        }
        return a.substring(a.indexOf('1'));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.next().trim();
            System.out.println (check(s));
        }
    }
}