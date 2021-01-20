// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {

        // HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // map.put(S.charAt(0), 1);
        // String ans = S.charAt(0) + "";
        // for (int i = 1 ; i < S.length() ; i++) {
        //     char curr = S.charAt(i);
        //     if (! map.containsKey(curr)) {
        //         map.put(curr, 1);
        //         ans = ans + curr;
        //     }
        // }
        
        
        
        String ans = new String();
        for (int i = 0 ; i < S.length() ; i++) {
            char currChar = S.charAt(i);
            if (ans.indexOf(currChar) < 0)
                ans = ans + currChar;
        }
        return ans;
    }
}