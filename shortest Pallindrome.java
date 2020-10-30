//https://leetcode.com/problems/shortest-palindrome/
public String shortestPalindrome(String s) {
    int i = 0 ;
    int j = s.length() - 1;
    
    while (i < j) {
        char ith = s.charAt(i);
        char jth = s.charAt(j);
        if (ith == jth) {
            i++;
            j--;
        }
        else {
            s = s.substring(0, i) + jth + s.substring(i);
            i++;
        }
    }
    
    return s;
}