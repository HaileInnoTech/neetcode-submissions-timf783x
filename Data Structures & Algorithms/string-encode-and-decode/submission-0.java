class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(String s : strs){
            str+= Integer.toString(s.length()) + "#" + s;
        }
        System.out.print(str);
        return str;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i< str.length() - 1){
            int j = i;

            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j,j+length);
            
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }

    return res;
    }
}
