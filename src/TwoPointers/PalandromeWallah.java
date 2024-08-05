package TwoPointers;

public class PalandromeWallah {

    public static void main(String[] args) {
        String s= "race a car";
        Solution solution = new Solution();
        boolean success = solution.isPalindrome(s);
        System.out.println(success);
    }

    private static class Solution {
        public boolean isPalindrome(String s) {
            // s = s.trim();
            char[] charArray = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray(); 
            
            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {
                if(charArray[left] != charArray[right]){
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }

}