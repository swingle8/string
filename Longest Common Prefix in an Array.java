// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution{
    String longestCommonPrefix(String arr[], int n){
        if (arr.length == 1)
            return arr[0];
        if (arr.length == 0)
            return "-1";
        String ans = longestPrefix(arr[0], arr[1]);
        for (int i = 2 ; i < n ; i++)
            ans = longestPrefix(ans, arr[i]);
        return ans;
    }
    
    
    String longestPrefix (String s1, String s2) {
        String ans = new String();
        if (s1 == null || s2 == null)
            return "-1";
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0 ; i < len ; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                ans = ans + s1.charAt(i);
            }
            else {
                break;
            }
        }

        if (ans.equals(""))
            return "-1";
        return ans;
    } 
}  