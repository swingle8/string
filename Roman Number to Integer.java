// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            RomanToNumber rn = new RomanToNumber();
            System.out.println(rn.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class RomanToNumber {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        int num = 0;
        int len = str.length();
        char prev = '*';
        for (int i = 0 ; i < len ; i++) {
            char curr = str.charAt(i);
            switch (curr) {
                case 'I' : 
                    num = num + 1;
                    break;
                case 'V' : 
                    num = num + 5;
                    break;
                case 'X' : 
                    num = num + 10;
                    break;
                case 'L' : 
                    num = num + 50;
                    break;
                case 'C' : 
                    num = num + 100;
                    break;
                case 'D' : 
                    num = num + 500;
                    break;
                case 'M' : 
                    num = num + 1000;
                    break;
            }
            
            if (prev == 'I' && curr != 'I')
                    num = num - 2;
            else if (prev == 'V' && (curr == 'X' || curr == 'L' || curr == 'C' || curr == 'D' || curr == 'M'))
                    num = num - 10;
            else if (prev == 'X' && (curr == 'L' || curr == 'C' || curr == 'D' || curr == 'M'))
                    num = num - 20;
            else if (prev == 'L' && (curr == 'C' || curr == 'D' || curr == 'M'))
                    num = num - 100;
            else if (prev == 'C' && (curr == 'D' || curr == 'M'))
                    num = num - 200;
            else if (prev == 'D' && (curr == 'M'))
                    num = num - 1000;
            
            prev = curr;
        }
        return num;
    }
}