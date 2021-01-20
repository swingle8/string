import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int cases = sc.nextInt();
	    while (cases-- > 0) {
	        String s = sc.next();
	        System.out.println(LongestDistinctChar(s));
	    }
	        
	}
	
	public static int LongestDistinctChar (String s) {
	    int maxLen = 1;
	    int start = 0;
	    int end = 1;
	    int count = 1;
	    int len = s.length();
	    
	    while (end < len) {
	        count++;
	        if (s.substring(start, end).indexOf(s.charAt(end)) > -1) {
	            while (start < end && s.charAt(start) != s.charAt(end)) {
	                start++;
	                count--;
	            }
	            if (start < end && s.charAt(start) == s.charAt(end)) {
	                start++;
	                count--;
	            }
	        }
	        end++;
	        maxLen = Math.max(maxLen, count);
	    }
	    return maxLen;
	}
}