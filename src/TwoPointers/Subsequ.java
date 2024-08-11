package TwoPointers;

public class Subsequ {
    public static void main(String[] args) {
        // s = "abc", t = "ahbgdc"   axc  ahbgdc
        String s = "";
        String t = "ahbgdc";
        Solution solution = new Solution();
        boolean don = solution.isSubsequence(s, t);
        System.out.println(don);
    }

}

class Solution {
    static boolean isSubsequence(String s, String t) {
        int i = 0;
        int count = 0;
        while( i<t.length() && count<s.length()) {
            if (t.charAt(i) == s.charAt(count)) {
                count = count + 1;
                i++;
                continue;
            }
            i++;
        }
        if (count == s.length()) {
            return true;
        }
        return false;
    }
}