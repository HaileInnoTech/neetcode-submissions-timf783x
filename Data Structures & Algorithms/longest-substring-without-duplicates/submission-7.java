class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res= 0;
        Map<Character, Object> map = new HashMap<>();        
        int l = 0;
        int r = l;
        char[] str = s.toCharArray();
        while(r < str.length){
            if(!map.containsKey(str[r])){
                map.put(str[r], null);
            }
            else{
                map.clear();
                l++;
                r=l;
                map.put(str[l], null);

                
            }
            res= Math.max(res, map.size());

            r++;
            
        }
        return res; 
    }
}
