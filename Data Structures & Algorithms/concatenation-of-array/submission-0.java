class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int n : nums){
            arr.add(n);
        }
        arr.addAll(arr);

     int[] res = new int[arr.size()];
     for(int i = 0 ; i< arr.size(); i++){
        res[i] = arr.get(i);
     }
    return res;
        
    }
}