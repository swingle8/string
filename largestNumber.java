//https://leetcode.com/problems/largest-number/

class Solution {
    public String largestNumber(int[] nums) {
        if (nums.length == 0)
            return "";
        int len = nums.length;
        String [] str = new String [len];
        for (int i = 0 ; i < len ; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(str, new Comparator<String>() {
            public int compare (String s1, String s2) {
                String s3 = s1 + s2;
                String s4 = s2 + s1;
                return s4.compareTo(s3);
            }            
        });
        
        // for (int i = 0 ; i < len ; i++)
        //     System.out.print(str[i] + " ");
        
        if (str[0].charAt(0) == '0')
            return "0";
        String ans= "";
        for (int i = len-1 ; i >= 0 ; i--) {
            ans = str[i] + ans;
        }
        
        return ans;
    }
}