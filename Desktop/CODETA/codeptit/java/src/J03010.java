import java.util.*;
public class J03010 {
    public static String chuanhoa (String s){
        char chudau = Character.toLowerCase(s.charAt(0));
        return chudau + "";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map = new HashMap<>(); //de map ra ngoai de khong bi reset sau moi lan t thay doi
        while (t-- > 0){
            String hoten = sc.nextLine().trim();
            String[] ten = hoten.split("\\s+");
            String email = "";
            for (int i = 0; i < ten.length - 1; i++){
                email += chuanhoa(ten[i]) ;
            }
            String name = ten[ten.length - 1].toLowerCase();
            String duoi = "@ptit.edu.vn";
            String result = name + email ;
            map.put(result , map.getOrDefault(result ,0) + 1);
            if (map.get(result) == 1){
                System.out.println (result + duoi);
            } else {
                System.out.println (result + map.get(result) + duoi);
            }
        }
    }
}
