class Solution {
    public boolean isAnagram(String s, String t) {

        // char[] sArray = s.toCharArray();
        // Arrays.sort(sArray); 
        // String sString = new String(sArray);
        
        // char[] tArray = t.toCharArray();
        // Arrays.sort(tArray);
        // String tString = new String(tArray);

        // if(sString.equals(tString)){
        //     return true;
        // }
        // else{
        // return false ;
        // }
       if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
        
    }
}
