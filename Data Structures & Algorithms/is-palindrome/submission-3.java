class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.print(str);

       int right = str.length() - 1;
       int left = 0;
        while(left < right){
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
