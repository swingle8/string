import java.util.*;
public class MaxRepeatingSubString {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();

        System.out.println(getLongest(s));
    }

    public static String getLongest (String s) {
        int i = 0;
        int j = s.length()-1;
        String longest = "";
        String a = "";
        String b = "";
        while (i < j) {
            a = a + s.charAt(i);
            b = s.charAt(j) + b;

            if (a.equals(b)) {
                longest = a;
            }

            i++;
            j--;
        }
        if (longest == "")
            return "-1";
        int times = s.length()/longest.length();
        String ans = "";
        while (times > 0) {
            ans = ans + longest;
            times--;
        }

        if (ans.equals(s))
            return longest;
        return "-1";
    }
}