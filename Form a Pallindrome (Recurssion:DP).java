import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int cases = sc.nextInt();
	    
	    while (cases -- > 0) {
	        String s = sc.next();
	        int len = s.length()-1;
	        System.out.println(MinMovesFormPallindrome(s));
	    }
	}
	
	//Recursion
	public static int MinMovesFormPallindrome (String s, int start, int end) {
	    if (start > end) {
	        return 0;
	    }
	    
	    if (s.charAt(start) == s.charAt(end)) {
	        start++;
	        end--;
	        return MinMovesFormPallindrome (s, start, end);
	 }
	   
	    return Math.min (MinMovesFormPallindrome(s, start+1, end), MinMovesFormPallindrome(s, start, end-1)) + 1;
	}
	
	//DP
	public static int MinMovesFormPallindrome (String s) {
	    int len = s.length();
	    int [][] DP = new int [len][len];
	    
	    for (int i = 1 ; i < len ; i++ ) {
	        int j = i;
	        for (int k = 0; k < len-i ; k++) {
	            if (s.charAt(j) == s.charAt(k))
	                DP[k][j] = DP[k+1][j-1];
	            else
	                DP[k][j] = Math.min(DP[k+1][j], DP[k][j-1])+1;
	           j++;
	        }
	    }
	    
	    return DP[0][len-1];
	}
}