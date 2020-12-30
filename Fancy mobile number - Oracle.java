/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String number = "87644587876";
		if (isRepeated(number) || progression(number) || subsequentRepeat(number))
		    System.out.println("Fancy number");
		else 
		    System.out.println("Not a Fancy number");
	}
	
	static boolean isRepeated (String number) {
        int previous = -1;
        int counter = 0;
        for (int i = 0; i < 11 ; i++) {
            int num = (int) number.charAt(i);
            if (previous == num)
                counter++;
            else {
                counter = 0;
                previous = num;
            }
            if (counter == 4)
                return true;
            
        }
        return false;
	}
	
	static boolean progression (String number) {
        int previous = -2;
        int counter = 0;
        for (int i = 0; i < 11 ; i++) {
            int num = (int) number.charAt(i);
            if (previous+1 == num) {
                counter++;
                previous = num;
            }
            else {
                counter = 0;
                previous = num;
            }
            //System.out.println(counter);
            if (counter == 4)
                return true;
            
        }
        return false;
	}
	
	static boolean subsequentRepeat (String num) {
        int start = 0;
        int end = 2;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (; end <= num.length()-1 ; end++) {
            String part = num.substring(start, end+1);
            if (map.containsKey(part))
                return true;
            else
                map.put(part, 1);
            start++;
        }
        return false;
	}
}
