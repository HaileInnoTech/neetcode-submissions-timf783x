class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //    Map<String, List<String>> map = new HashMap<>(); 
    //    for(String s : strs){
    //     char[] sArray = s.toCharArray();
    //     Arrays.sort(sArray);
    //     String sortedS = new String(sArray);
    //     map.putIfAbsent(sortedS, new ArrayList<>());
    //     map.get(sortedS).add(s);

    //    }
    //    return new ArrayList<>(map.values());
        Map<String,List<String>> map =new HashMap<>();
        for(String s : strs){
            // create an list of 26 int 
            int[] count = new int[26];
            //count =[0,0,0,0,...]
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            //count[1,0,0,2,...]
            //store string count as the key in map 
            String key = Arrays.toString(count);
            //value of key(count) is an arrayList
            map.putIfAbsent(key, new ArrayList<>());
            //add the s as the value of key(count)
            map.get(key).add(s);
        
        }
        return new ArrayList<>(map.values());
    }
}
