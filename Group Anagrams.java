//https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>> ();
        
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (int i = 0 ; i < strs.length ; i++) {
            int [] strArr = new int[26];
            String curr = strs[i];
            
            for (int j = 0 ; j < curr.length() ; j++) {
                char nowchar = curr.charAt(j);
                strArr[nowchar-'a']++;
            }
            
            String key = "";
            
            for (int j = 0 ; j < strArr.length ; j++)
                key = key + strArr[j] + " ";
              
            if (! map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
                ans.add(map.get(key));
            }
            
            map.get(key).add(curr);
            
        }
        
        return ans;
    }
}