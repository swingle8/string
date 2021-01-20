// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Anagram obj = new Anagram();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends


class Anagram{    
    /*  Function to check if two strings are anagram
    *   a, b: input string
    */
    public static boolean isAnagram(String a,String b) {
        if (a.length() != b.length())
            return false;
        
        int count = 0;
        for (int i = 0 ; i < a.length() ; i++)
            count = count + a.charAt(i);
        
        for (int i = 0 ; i < b.length() ; i++)
            count = count - b.charAt(i);
        
        if (count == 0)  
            return true;
        return false;
    }
}