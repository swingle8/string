//https://leetcode.com/problems/string-compression/submissions/
class Solution {
    public int compress(char[] chars) {
        char prev = ' ';
        int count = 1;
        int point = 0;
        for (int i = 0 ; i < chars.length ; i++) {
            char curr = chars[i];
            if (curr == prev) {
                count++;
                if ((i+1 < chars.length && chars[i+1] != curr) || i == chars.length-1) {
                    String strCount = String.valueOf(count);
                    for (int j = 0 ; j < strCount.length() ; j++) {
                        chars[point] = strCount.charAt(j);
                        point++;
                    }
                }
            }
            else {
                chars[point] = curr;
                count = 1;
                point++;
            }
            prev = curr;
        }
        
        return point;
    }
}