https://leetcode.com/problems/group-anagrams/submissions/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>> ();
        
         HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for (int i = 0 ; i < strs.length ; i++) {
            String curr = strs[i];
            char [] charArr = curr.toCharArray();
            Arrays.sort(charArr);
            String updated = new String(charArr);
            
            if (! map.containsKey(updated)) {
                map.put(updated, new ArrayList<String>());
                ans.add(map.get(updated));
            }
            
            map.get(updated).add(curr);
        }
        
         return ans;
    }
}