// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Rotation obj = new Rotation();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}// } Driver Code Ends


class Rotation{
    
    /*  Function to check if two strings are rotated
    *   s1, s2: input strings
    */
    public static boolean isRotated(String s1, String s2){
        if (s1.length() <= 2) {
            if (s1.equals(s2))
                return true;
            return false;
        }
        if (s1.equals(s2.substring(2, s2.length()) + s2.substring(0,2)))
            return true;
        else if (s1.equals(s2.substring(s2.length()-2, s2.length()) + s2.substring(0,s2.length()-2)))
            return true;
        return false;
    }
    
}