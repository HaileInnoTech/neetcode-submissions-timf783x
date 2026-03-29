class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] result = new int[2];
        // for(int i = 0 ; i <= nums.length-1; i++) {
        //     for( int j = 0 ; j <= nums.length -1; j++) {
        //         if(nums[i] + nums[j] == target){
        //             result[0] = j;
        //         result[1] = i ;
        //         }
                
        //     }
        // }
        // return result;
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            int diff = target - nums[i];
            if(!map.containsKey(diff)){
                 map.put(nums[i], i);
            }
            else {
                result[1] = i;
                result[0] = map.get(diff);
            }
    

        }
        return result;
    }
}
