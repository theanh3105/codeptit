import java.util.*;
public class J03027 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine().trim();
        Stack <Character> st = new Stack <>();
        for (char c : s.toCharArray()){
            if (!st.empty() && st.peek() == c){
                st.pop();
            }
            else {
                st.push(c);
            }
        }
        if (st.empty()){
            System.out.print("Empty String");
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : st){
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}


