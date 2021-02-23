import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases -- > 0) {
            TreeSet<String> ans = new TreeSet<String>();

            String s = sc.next();
            getPermutations (s, 0, ans);
            
            for (String key : ans)
                System.out.print(key + " ");
            System.out.println();
        }
	 }
	 
	 public static void getPermutations (String s, int i, TreeSet<String> ans) {
	     if (i == s.length()) {
	       ans.add(s);
	       return;
	     }
	     
	     String ith = s.charAt(i)+"";
	     for (int j = i ; j < s.length() ; j++)
	         getPermutations (swap(s, i, j), i+1, ans);
	 }
	 
	 public static String swap (String s, int i, int j) {
        char [] str = s.toCharArray();
        char temp = str[j];
        str[j] = str[i];
        str[i] = temp;
        String ans = new String(str);
        return ans;
	 }
}