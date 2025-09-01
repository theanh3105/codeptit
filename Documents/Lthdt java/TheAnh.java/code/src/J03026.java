import java.util.*;
public class J03026 {
    public static int check (String s1 , String s2){
        if (s1.equals(s2)){
            return -1;
        } if (s1.length() == s2.length()){
            return s1.length();
        }
        return Math.max (s1.length(), s2.length());

    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println (check(s1, s2));
        }
    }
}