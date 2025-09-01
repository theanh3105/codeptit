import java.util.*;
public class J03009 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
           String s1 = sc.nextLine().trim();
           String s2 = sc.nextLine().trim();
           String[] a = s1.split(" ");
           String[] b = s2.split(" ");

           Set<String> set1 = new HashSet<>(Arrays.asList(a));
           Set<String> set2 = new HashSet<>(Arrays.asList(b));
           Set<String> result = new TreeSet<>();
           for (String word : set1){
               if (!set2.contains(word)){
                   result.add(word);
               }
           }
           for (String word : result){
               System.out.print (word + " ");
           }
           System.out.println();

        }
    }
}